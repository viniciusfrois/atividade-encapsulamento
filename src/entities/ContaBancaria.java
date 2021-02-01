package entities;

public class ContaBancaria {
	//Atributos Privados
	private int numeroConta;
	private String nomeConta;
	private double depositoConta;
	
	//Construtor
	public ContaBancaria(int numeroConta, String nomeConta, double depositoConta) {
		this.numeroConta = numeroConta;
		this.nomeConta = nomeConta;
		adicionaSaldo(depositoConta);
	}
	//Getter e Setter para Acessar ou Modificar os Atributos Privados *NumeroConta e Deposito só GET
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

	public double getDepositoConta() {
		return depositoConta;
	}
	
	//Metodos Calculos
	public void adicionaSaldo (double valor) {
		this.depositoConta += valor;		
	}
	public void removeSaldo (double valor) {
		this.depositoConta -= valor + 5.00;
	}
	
	//Metodo imprimir OBJETO 
	@Override
	public String toString() {
		return    String.format("Conta Bancaria:%nNumero da Conta = %d, ", numeroConta)				 
				+ String.format("Titular da Conta = %s, ", nomeConta)   
				+ String.format("Deposito da Conta = %.2f", depositoConta);
				
	}
	
	
	
}
