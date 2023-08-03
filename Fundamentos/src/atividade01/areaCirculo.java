
package atividade01;

import java.util.Scanner;


public class areaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        double raio = scanner.nextDouble();
        scanner.close();
        double area = 3.14 * (raio * raio);
        System.out.println("Sua área é: " + area );
    }

}
