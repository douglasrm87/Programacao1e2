package jogogenius;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
public class JogoGenius {
	public static void main(String[] args) {
		new JogoGenius().processar();
	}
	protected static int jogadasTempJogador = 0;
	public static int AZUL = 1;
	public static int LARANJA = 2;
	public static int VERDE = 3;
	public static int VERMELHO = 4;
	protected static int vetComputador[] = new int[10];
	protected static int indVetComputador = 0;
	protected static int vetJogador[] = new int[10];
	protected static int indVetJogador = 0;
	protected static JToggleButton botaoVerde = null;
	protected static JToggleButton botaoAzul = null;
	protected static JToggleButton botaoVermelho = null;
	protected static JToggleButton botaoLaranja = null;
	protected static List<ComputadorDTO> jogadasComputador = new ArrayList<>();
	JButton computador = null;// esta
	protected static final int _1000 = 200;
	protected static final int _10 = 3;
	protected void piscar(JToggleButton obj) throws InterruptedException {
		for (int i = 0; i < _10; i++) {

			obj.setSelected(true);
			Thread.sleep(_1000);
			obj.setSelected(false);
			Thread.sleep(_1000);

		}
	}
	protected void validarJogadas() {
		if (jogadasTempJogador == indVetComputador) {
			// comparar as jogadas
			for (int i = 0; i < vetComputador.length; i++) {
				if (vetComputador[i] != vetJogador[i]) {
					JOptionPane.showMessageDialog(null, "Perdeu o jogo.");
					return;
				}
			}
			JOptionPane.showMessageDialog(null, "Parabéns, você acertou.");
			JOptionPane.showMessageDialog(null, "Continuaremos.");
			ComputadorDTO opcao = new ComputadorDTO();
			opcao.setIdBotao(VERDE);
			opcao.setBotaoPressionado(JogoGenius.botaoVerde);
			JogoGenius.jogadasComputador.add(opcao);
			limparDados();
			continuarComputador();
		}
	}

	private void limparDados() {
		JogoGenius.jogadasTempJogador = 0;
		JogoGenius.indVetJogador = 0;
		JogoGenius.indVetComputador = 0;
		JogoGenius.vetComputador = new int[10];
		JogoGenius.vetJogador = new int[10];

	}
	protected void apresentarVetorComputador() {
		System.out.println("Vetor do computador");
		for (int j = 0; j < JogoGenius.vetComputador.length; j++) {
			System.out.print("Vetor [" + j + "]:" + vetComputador[j] + ", ");
		}
		System.out.println();
	}
	protected void apresentarVetorJogador() {
		System.out.println("Vetor do jogador");

		for (int j = 0; j < JogoGenius.vetJogador.length; j++) {
			System.out.print("Vetor [" + j + "]:" + vetJogador[j] + ", ");
		}
		System.out.println();
	}
	private void processar() {
		ImageIcon verde = new ImageIcon("verde.jpg");
		JogoGenius.botaoVerde = new JToggleButton(verde);
		ImageIcon azul = new ImageIcon("azul.jpg");
		JogoGenius.botaoAzul = new JToggleButton(azul);
		ImageIcon laranja = new ImageIcon("laranja.jpg");
		JogoGenius.botaoLaranja = new JToggleButton(laranja);
		ImageIcon vermelho = new ImageIcon("vermelho.jpg");
		JogoGenius.botaoVermelho = new JToggleButton(vermelho);
		this.computador = new JButton("Computador");
		JPanel painel = new JPanel();
		painel.add(this.computador);
		painel.add(JogoGenius.botaoVerde);
		painel.add(JogoGenius.botaoVermelho);
		painel.add(JogoGenius.botaoAzul);
		painel.add(JogoGenius.botaoLaranja);
		JFrame tela = new JFrame("Genius");
		tela.add(painel);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.pack(); // faz a aplicação ficar com a melhor dimensão possivel
		tela.setVisible(true);
		ouvirBotao();
	}
	private void ouvirBotao() {
		ComputadorDTO opcao = new ComputadorDTO();
		opcao.setIdBotao(LARANJA);
		opcao.setBotaoPressionado(JogoGenius.botaoLaranja);
		JogoGenius.jogadasComputador.add(opcao);
		opcao = new ComputadorDTO();
		opcao.setIdBotao(AZUL);
		opcao.setBotaoPressionado(JogoGenius.botaoAzul);
		JogoGenius.jogadasComputador.add(opcao);
		this.computador.addActionListener(new Computador(JogoGenius.jogadasComputador));
		JogoGenius.botaoVerde.addActionListener(new Verde(JogoGenius.botaoVerde));
		JogoGenius.botaoLaranja.addActionListener(new Laranja(JogoGenius.botaoLaranja));
		JogoGenius.botaoAzul.addActionListener(new Azul(JogoGenius.botaoAzul));
		JogoGenius.botaoVermelho.addActionListener(new Vermelho(JogoGenius.botaoVermelho));
	}
	private void continuarComputador() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					for (ComputadorDTO computadorDTO : jogadasComputador) {
						piscar(computadorDTO.getIdBotao(), computadorDTO.getBotaoPressionado());
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Tente acertar a sequencia.");

			}
		}).start();
	}
	protected void piscar(int idBotao, JToggleButton obj) throws InterruptedException {
		JogoGenius.vetComputador[JogoGenius.indVetComputador] = idBotao;
		JogoGenius.indVetComputador++;
		for (int i = 0; i < _10; i++) {

			obj.setSelected(true);
			Thread.sleep(_1000);
			obj.setSelected(false);
			Thread.sleep(_1000);
		}
		apresentarVetorComputador();
	}
}
