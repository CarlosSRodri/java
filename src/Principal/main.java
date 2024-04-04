package Principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class main{

	public static void main(String[] args) {
		// BLOCO - Declaração de Variaveis
		
		float nota1, nota2, media, notar, mediar;
		String sn1, sn2, snr;
		
//		// BLOCO - Entrada de Dados
//		
////		nota1 = 8;
////		nota2 = 7;
//		Scanner read = new Scanner(System.in);
//		System.out.println("Digite o Valor da 1º Nota: ");
//		nota1 = read.nextFloat();
//		System.out.println("Digite o Valor da 2º Nota: ");
//		nota2 = read.nextFloat();
		
		sn1 = JOptionPane.showInputDialog("Digite o Valor da 1º Nota: ");
		nota1 = Float.parseFloat(sn1);
		
		sn2 = JOptionPane.showInputDialog("Digite o Valor da 2º Nota: ");
		nota2 = Float.parseFloat(sn2);
		
		//BLOCO - Processamento
		media = (nota1 + nota2)/2;
		
		//BLOCO - Saída de Dados
		if(media >= 7) {
			JOptionPane.showMessageDialog(null,"Aprovado com média: " + media);
			// System.out.println("Aprovado com média" + media);	
		}else if(media < 7) {
			JOptionPane.showMessageDialog(null,"Aluno em Recuperação: " + media);
			// System.out.println("Aluno em Recuperação" + media);
			
			snr = JOptionPane.showInputDialog("Digite o Valor da 1º Nota de Recuperação: ");
			notar = Float.parseFloat(snr);
		
			mediar = (media + notar)/2;
			if(mediar > 0 && mediar >= 5) {
				// System.out.println("Aprovado em recuperação com média" + mediar);
				JOptionPane.showMessageDialog(null,"Aprovado em recuperação com média: " + mediar);
			}else {
				// System.out.println("Reprovado com Média" + mediar);
				JOptionPane.showMessageDialog(null,"Reprovado com média: " + mediar);
			}
		}else {
			
		}
		 	
	}
}
