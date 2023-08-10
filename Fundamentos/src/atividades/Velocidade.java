package atividades;




import java.util.Scanner;


public class Velocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        final int limiteVelocidade = 80;
        final double multaPorKm = 5.0;
        System.out.println("Digite a velocidade do carro:");
        double velocidadeCarro = scanner.nextDouble();
        if (velocidadeCarro > limiteVelocidade) {
            double kmAcima  = velocidadeCarro - limiteVelocidade;
            double valorMulta = kmAcima * multaPorKm;
            System.out.println("Multa por limite de velocidade excedido. Valor da multa: R$" + valorMulta);           
        } else {
            System.out.println("Velocidade dentro do limite.");
        }
    }

}
