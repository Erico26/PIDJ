package ex3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        
    
        System.out.println("Digite um número: ");
                Integer num = Integer.valueOf(leitura.nextLine());
                if(num % 2 == 0 ) {
                    System.out.println("Par");
                }
                    else {
                            System.out.println("Impar");
                            
                }
        System.out.println(num);

        
        }

}