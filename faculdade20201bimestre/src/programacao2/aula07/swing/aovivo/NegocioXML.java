package programacao2.aula07.swing.aovivo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class NegocioXML {
	
	public static void main(String[] args) {
		new NegocioXML().processar();
	}
	private void processar() {
		try {
			localizarArquivo();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public List<Negocio> carregarDadosArqXML(Reader fonte) {
		XStream stream = new XStream(new DomDriver());
		stream.alias("negocio", Negocio.class);
		List<Negocio> listaNegocio = (List<Negocio>) stream.fromXML(fonte);
		return listaNegocio;
	}

	public void localizarArquivo() throws IOException {
		try {
			JFileChooser chooser = new JFileChooser();
			chooser.setCurrentDirectory(new java.io.File("."));
			chooser.setFileFilter(new FileNameExtensionFilter("Apenas XML", "xml"));
			int retorno = chooser.showOpenDialog(null);
			if (retorno == JFileChooser.APPROVE_OPTION) {
				FileReader reader = new FileReader(chooser.getSelectedFile());
				List<Negocio> negocios = carregarDadosArqXML(reader);
				Negocio primeiroNegocio = negocios.get(0);
				String mensagem = "Primeiro negócio: " + primeiroNegocio.getPreco();
				JOptionPane.showMessageDialog(null, mensagem);
				reader.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
