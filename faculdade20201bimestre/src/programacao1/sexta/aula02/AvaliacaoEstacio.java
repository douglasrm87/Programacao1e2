package programacao1.sexta.aula02;

/*
 * Exercícios 28/02/2020.
 * Utilizar a ferramenta de debug do Eclipse para auxiliar em parte dos exercícios.
 * Realizar parte dos exercícios utilizando o teste de mesa no caderno.
 Quais linhas deste programa serão executas para as seguintes notas:

 Usar o caderno para:
 a) AV1 = 100, 				Av2 = 80				Aprovado
 a) AV1 = 85,  				AV2 = 35	AV3 = 45    Aprovado   
 b) Av1 = 50,  				AV2 = 50,	AV3 = 50 	Final
 b) Av1 = 10,  AVR = 10,	Av2 = 40, 	AV3 = 80 	Final
 c) Av1 = 10,  AVR = 80,  	Av2 = 10				Reprovado
 
 Usar a feramenta do eclipse para:
 d) Av1 = 10,  AVR = 100,  	AV2 = 60, 	AV3 = 10	Reprovado
 e) Av1 = 30,  AVR = 90,  	AV2 = 80, 				Aprovado
 f) Av1 = 35,  AVR = 85,  	AV2 = 40, 	AV3 = 80	Aprovado

Apresentar os pontos de melhorias no programa
 */
import java.util.Scanner;

public class AvaliacaoEstacio {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double av1 = 0.0;
		double av2 = 0.0;
		double av3 = 0.0;
		double avr = 0.0;
		double media = 0.0;
		System.out.println("Digite a nota AV1:");
		av1 = leia.nextDouble();
		if (av1 < 4) {
			// implementar AVR
			System.out.println("Digite a nota AVR:");
			avr = leia.nextDouble();
			av1 = (av1 + avr) / 2;
		}
		System.out.println("Digite a nota AV2:");
		av2 = leia.nextDouble();
		// avaliar a necessidade da av3
		if ((av1 < 4) && (av2 < 4)) {
			media = (av1 + av2) / 2;
		} else {
			// faltou tratar o caso de nao fazer av3
			if ((av1 >= 6) && (av2 >= 6)) {
				media = (av1 + av2) / 2;
			} else {
				System.out.println("Digite a nota AV3:");
				av3 = leia.nextDouble();
				if (av1 >= av2) {
					// computar media com av1
					media = (av1 + av3) / 2;
				} else {
					// computar a media com av2
					media = (av2 + av3) / 2;
				}
			}
		}
		if (media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		leia.close();
	}
}
