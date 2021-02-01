package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.ContaBancaria;

public class ProgramaBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner (System.in);
		double depositodaConta = 0;
		
		//Entradas
		System.out.println("Informe Numero da Conta");		
		int numerodaConta = teclado.nextInt();
		
		System.out.println("Informe Nome da Conta");
		teclado.nextLine();
		String nomedaConta = teclado.nextLine();
		
		System.out.println("Deseja fazer um deposito Inicial? (S/N)");
		char resposta = teclado.next().charAt(0);
		
		
		//Verifica Condição da respota
		if (resposta == 'S' || resposta == 's') {
			System.out.println("Qual valor do Deposito?");
			depositodaConta = teclado.nextDouble();
		} else {
		
		}
		//Instanciando Objeto ContaBancaria + Construtor
		ContaBancaria contabancaria = new ContaBancaria(numerodaConta, nomedaConta, depositodaConta);
		System.out.println(contabancaria);
		//Chamando método adicionaSaldo
		System.out.println("Informe outro valor de Deposito:");
		double valor2 = teclado.nextDouble();
		contabancaria.adicionaSaldo(valor2);
		System.out.println("Saldo Atualizado da " + contabancaria);	
		//Chamando método removeSaldo
		System.out.println("Informe um valor de Saque:");
		double valor3 = teclado.nextDouble();
		contabancaria.removeSaldo(valor3);
		System.out.println("Saldo Atualizado da " + contabancaria);	
	
		teclado.close();		
	}

}
