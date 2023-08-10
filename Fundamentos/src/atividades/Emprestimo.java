
package atividades;

import java.util.Scanner;


public class Emprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.println("Digite o valor da casa:");
        double valorCasa = scanner.nextDouble();
        System.out.println("Digite seu salario:");
        double salario = scanner.nextDouble();
        double valorprestacao = valorCasa / (salario * 0.30);
        System.out.println("O valor de cada prestação sera: " + valorprestacao);
    }

}
