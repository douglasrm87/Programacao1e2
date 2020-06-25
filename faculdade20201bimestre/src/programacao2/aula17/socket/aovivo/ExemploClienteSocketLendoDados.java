package programacao2.aula17.socket.aovivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ExemploClienteSocketLendoDados {
	public static void main(String[] args) throws IOException {
		new ExemploClienteSocketLendoDados().processar();
	}

	Scanner sc = new Scanner(System.in).useDelimiter("\r\n");

	private void processar() throws IOException {
		String tHost;
		int tPorta;

		OutputStream tArq1 = null;
		PrintWriter tArq2 = null;
		InputStream tArq3 = null;
		InputStreamReader tArq4 = null;
		BufferedReader tArq5 = null;
		String tLinha;

		while (true) {
			System.out.print("Digite um host : ");
			tHost = sc.next();
			if (tHost.equals("fim"))
				break;

			System.out.println("Digite o número da Porta(3000): ");
			tPorta = sc.nextInt();
			try (Socket tSocket = new Socket(tHost, tPorta);) {

				System.out.println("Conexão estabelecida.");

				tArq1 = tSocket.getOutputStream();
				tArq2 = new PrintWriter(tArq1, true);

				tArq3 = tSocket.getInputStream();
				tArq4 = new InputStreamReader(tArq3);
				tArq5 = new BufferedReader(tArq4);

				while (true) {
					System.out.println(" Digite um texto: ");
					tLinha = sc.next();
					if (tLinha.equals("fim") || tLinha.equals("quit")) {
						tArq2.println(tLinha);
						break;
					}

					System.out.println("Enviando...|" + tLinha + "|");
					tArq2.println(tLinha);

					tLinha = tArq5.readLine();
					System.out.println("Recebendo..|" + tLinha + "|");

				}
				tArq2.close();
				tArq5.close();
				tSocket.close();
			} catch (UnknownHostException e) {
				System.out.println("IP não encontrado.");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Erro na conexão.");
				e.printStackTrace();
			}
		}

		if (tArq1 != null)
			tArq1.close();
		if (tArq2 != null)
			tArq2.close();
		if (tArq3 != null)
			tArq3.close();
		if (tArq4 != null)
			tArq4.close();
		if (tArq5 != null)
			tArq5.close();

	}
}
