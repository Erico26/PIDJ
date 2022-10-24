package ifsc;

public class Professor extends Aluno{

	
	public Integer siape;
	
	public Professor() {
		
	}
	
	public Professor(Integer siape) {
		this.siape = siape;
	}
	
	public Integer getsiape() {
		return siape;
	}
	
	public void setsiape(Integer siape) {
		this.siape = siape;
	}
}
