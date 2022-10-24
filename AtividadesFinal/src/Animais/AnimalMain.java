package Animais;

public class AnimalMain {

	public static void main(String[] args) {

		Cachorro c = new Cachorro();
		c.setcomprimento( 2324.0);
		c.setcor("Preto");
		c.setnome("Mili");
		
		Gato g = new Gato();
		g.setmia( "É, ele mia(não sei oq escreveer)");
		g.setcor("Laranja");
		g.setnome("Aurora");
	
	System.out.println("Quantidade de comprimentos do cachorro: "+c.getcomprimento());
	System.out.println("Cor do cachorro: "+c.getcor());
	System.out.println("Nome do cão: "+c.getnome());
	
	System.out.println("---------------------");
	
	System.out.println("O gato mia? "+g.getmia());
	System.out.println("Qual a cor do gato: "+g.getcor());
	System.out.println("Nome do gato: "+g.getnome());
	
	}

}
