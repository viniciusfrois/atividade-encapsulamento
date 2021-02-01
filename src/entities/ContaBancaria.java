package entities;

public class ContaBancaria {
	//Atributos Privados
	private int numeroDaConta;
	private String titularDaConta;
	private double saldoDaConta;

	//Construtor
	public ContaBancaria(int numeroDaConta, String titularDaConta, double saldoDaConta) {
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
		this.saldoDaConta = saldoDaConta;
	}
    
	//Getter e Setter * Saldo e Numero sem Set * Encapsulamento
	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public double getSaldoDaConta() {
		return saldoDaConta;
	}
	
	//Métodos Adiciona e Remove Saldo
	
	public void adicionaSaldo (double adiciona) {
		saldoDaConta += adiciona;
	}
	
	public void removeSaldo (double remove) {
		saldoDaConta -= remove - 5.00;
	}

	//Método para imprimir o Objeto 
	@Override
	public String toString() {
		return	  String.format("%n=================================%n>>Conta Bancaria<<%nNumero da Conta: %d%n", numeroDaConta)  
				+ String.format("Titular da Conta: %s%n", titularDaConta)
				+ String.format("Saldo da Conta: [R$ %.2f]%n=================================", saldoDaConta);

	}

}
