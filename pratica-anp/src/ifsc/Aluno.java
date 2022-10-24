package ifsc;

public class Aluno extends Pessoa {

	public Integer matricula;
	
	public Aluno() {
		
	}
	
	public Aluno(Integer matricula) {
		this.matricula = matricula;
	}
	
	public Integer getmatricula() {
		return matricula;
	}
	
	public void setmatricula(Integer matricula) {
		this.matricula = matricula;
	}

}

