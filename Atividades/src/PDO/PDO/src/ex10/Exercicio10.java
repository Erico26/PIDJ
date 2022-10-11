package ex10;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
    	
        Scanner leitura = new Scanner(System.in);

        Double nota1, nota2, nota3, media = 0.0;

        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();

        
        System.out.println("Digite nota 1: ");
        String n1 = leitura.nextLine();
        
        System.out.println("Digite nota 2: ");
        String n2 = leitura.nextLine();
        
        System.out.println("Digite nota 3: ");
        String n3 = leitura.nextLine();

        // Conversao de tipo (string -> Double)
        nota1 = Double.valueOf(n1);
        nota2 = Double.valueOf(n2);
        nota3 = Double.valueOf(n3);

        media = (nota1 + nota2 + nota3) / 3;

       
        System.out.println(nome + ", a sua media sera = " + media);
    }

}
