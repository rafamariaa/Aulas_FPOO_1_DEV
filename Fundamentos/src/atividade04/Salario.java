
package atividade04;

import java.util.Scanner;


public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        double salario = scanner.nextDouble();
        if (salario >= 1350) {
            double aumento = (salario * 0.10) + salario;
            System.out.println("Seu salario atual é: " + aumento);
        } else {
            double aumento0 = (salario * 0.15) + salario;
            System.out.println("Seu salario atual é: " + aumento0);
        }
    }
    
    

}
