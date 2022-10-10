package Banco;

public class ContaCorrente {

	public String NomedoTitular;
	public Long Cpf;
	public Long NumeroDaConta;
	public Double saldo;
	
	
	public Double Sacar(Double valorSacar) {
		
		double retornoSaque = 0;
		if(valorSacar > saldo) {
			System.out.println("Vaçpr Insuficiente");
		}else {
			saldo = saldo - valorSacar;
			retornoSaque = valorSacar;
		}
		
		
		return retornoSaque;
	}
	
	public void Depositar(Double valorDepositar) {
	
			saldo = saldo + valorDepositar;
		
	}
	
	public void MostrarDados() {
		
		System.out.println("Nome: "+ NomedoTitular);
		System.out.println("CPF: "+ Cpf);
		System.out.println("Número da conta: "+NumeroDaConta);
		System.out.println("Saldo: "+saldo);
		
	}
	
}
