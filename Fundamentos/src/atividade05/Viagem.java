
package atividade05;

import java.util.Scanner;


public class Viagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.println("Digite a distancia:");
        double distancia = scanner.nextDouble();
        if (distancia <=200) {
            double precoPassagem = (distancia * 0.50) + distancia;
            System.out.println("O valor final é: " +  precoPassagem);           
        } else {
            double  precoPassagem= (distancia * 0.45) + distancia;
            System.out.println("O valor final é: " +  precoPassagem);
        }
    }

}
