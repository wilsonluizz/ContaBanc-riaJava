package application;
import java.util.Scanner;

import entidades.Contapf;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
	
		
		Contapf conta1 = new Contapf();
		System.out.println("Cria��o de conta pessoa f�sica. Digite os dados do titular:");
		System.out.println("Nome: ");
		conta1.setNomeTitular(teclado.nextLine());
		System.out.println("Digite o n�mero da conta com 8 digitos: ");
		conta1.setNumeroConta(teclado.nextInt());
		System.out.println("Digite o valor do dep�sito inicial R$ ");
		conta1.setValorDeposito(teclado.nextDouble());
		
		
		System.out.println(conta1);
		
		System.out.println("Digite [1] para dep�sito - [2] para saque e [3] para finalizar");
		int op = teclado.nextInt();
		
		double valor;
		if (op == 1) {
			System.out.println("Digite o valor para dep�sito: R$ ");
			valor = teclado.nextDouble();
			conta1.opdeposito(valor);
		}
		else if (op == 2) {
			System.out.println("Digite o valor para saque: R$ ");
			valor = teclado.nextDouble();
			conta1.opsaque(valor);
		}
		
		System.out.println("Dados atualizados " + conta1);
		
		teclado.close();
		

	}

}
