package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.ContaBancaria;

public class ProgramaBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner (System.in);
		double saldoDaConta = 0;
		
		//Entradas
		System.out.println("Informe Numero da Conta");		
		int numeroDaConta = teclado.nextInt();
		
		System.out.println("Informe Titular da Conta");
		teclado.nextLine();
		String titularDaConta = teclado.nextLine();
		
		System.out.println("Deseja fazer um deposito Inicial? (S/N)");
		char resposta = teclado.next().charAt(0);
		
		
		//Verifica Condição da respota
		if (resposta == 'S' || resposta == 's') {
			System.out.println("Qual valor do Deposito?");
			saldoDaConta = teclado.nextDouble();
		} 
		
		//Instanciando Objeto ContaBancaria + Construtor
		ContaBancaria contabancaria = new ContaBancaria(numeroDaConta, titularDaConta, saldoDaConta);
		System.out.println(contabancaria);
		
		//Chamando método adicionaSaldo
		System.out.println("Informe outro valor de Deposito:");
		double deposito = teclado.nextDouble();
		contabancaria.adicionaSaldo(deposito);
		System.out.println();
		System.out.println("Saldo Atualizado:" + contabancaria);	
		//Chamando método removeSaldo
		System.out.println("Informe um valor de Saque:");
		double saque = teclado.nextDouble();
		contabancaria.removeSaldo(saque);
		System.out.println();
		System.out.println("Saldo Atualizado:" + contabancaria);
		System.out.println("Fim do Programa");
	
		teclado.close();		
	}

}
