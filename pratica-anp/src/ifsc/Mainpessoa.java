package ifsc;

public class Mainpessoa {

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		a.setcpf("123456");
		a.setnome("Roberta");
		a.setmatricula(12343254);
		
		Professor p = new Professor();
		p.setcpf("654321");
		p.setnome("André");
		p.setmatricula(5467832);
	
	System.out.println("Cpf aluno: "+a.getcpf());
	System.out.println("Nome aluno: "+a.getnome());
	System.out.println("Num matricula ( aluno): "+a.getmatricula());
	
	System.out.println("----------------------");
	
	System.out.println("Cpf professor: "+p.getcpf());
	System.out.println("Nome professor: "+p.getnome());
	System.out.println("Num matricula ( professor): "+p.getmatricula());

	}

	
	
}
