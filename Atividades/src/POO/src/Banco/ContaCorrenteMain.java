package Banco;

public class ContaCorrenteMain {

	public static void main(String[] args) {
		
		ContaCorrente s = new ContaCorrente();
		s.NomedoTitular = "Eric";
		s.Cpf = 8348932234l;
		s.NumeroDaConta = 29324234382l;
		s.saldo = 1000.00;
		
		s.MostrarDados();
		
		s.Depositar(50.0);
		s.Sacar(200.0);
		
		s.MostrarDados();
	}

}
