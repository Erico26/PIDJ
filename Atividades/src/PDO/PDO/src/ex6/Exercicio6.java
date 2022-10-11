package ex6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

    Scanner leitura = new Scanner(System.in);
    Integer[] vetor = new Integer[10];
    
    Integer menor=9999999, maior=-99999;
    
    for (int i = 0; i < 10; i++) {
        
        System.out.println("Digite um número: ");
        Integer num = Integer.valueOf(leitura.nextLine());
        vetor[i] = num;
        
         if (  vetor[i] > maior) {
              maior = vetor[i];
            }
         
         if ( vetor[i] < menor) {
              menor = vetor[i];
            }
        
    }
    
    System.out.println("Maior valor = "+ (maior));
    System.out.println("Menor valor = "+ (menor));
    
    }

}
