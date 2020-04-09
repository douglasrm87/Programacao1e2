package programacao2.aula09.swing.aovivo;

import java.awt.Font;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JTextField;

public class Relogio extends Thread {

	private JTextField texto;

	public Relogio(JTextField texto) {
		super();
		this.texto = texto;
	}

	public Relogio() {

	}

	@Override
	public void run() {
		while (true) {
			Date hora = Calendar.getInstance().getTime();
			try {
				this.texto.setFont(new Font("Dialog", Font.BOLD, 27));
				this.texto.setText(hora.toString());
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
