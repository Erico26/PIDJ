package Animais;

public class Animal {

	public String nome;
	public String raca;
	public Double comprimento;
	public Integer patas;
	public String cor;
	public String ecossistema;
	
	public Animal() {
		
	}
	
	public Animal(String nome, String raca, Double comprimento, Integer patas, String cor, String ecossistema) {
		this.nome = nome;
		this.raca = raca;
		this.comprimento = comprimento;
		this.patas = patas;
		this.cor = cor;
		this.ecossistema = ecossistema;
	}
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getraca() {
		return raca;
	}
	
	public void setraca(String raca) {
		this.nome = raca;
	}
	
	public Double getcomprimento() {
		return comprimento;
	}
	
	public void setcomprimento(Double comprimento) {
		this.comprimento = comprimento;
	}
	
	public Integer getpatas() {
		return patas;
	}
	
	public void setpatas(Integer patas) {
		this.patas = patas;
	}
	
	public String getcor() {
		return cor;
	}
	
	public void setcor(String cor) {
		this.cor = cor;
	}
	
	public String getecossistema() {
		return nome;
	}
	
	public void setecossistema(String ecossistema) {
		this.ecossistema = ecossistema;
		
		
	}
	
}
