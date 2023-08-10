
package aulaetruturadecisao;

import java.util.Scanner;


public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] veiculos = {"Fiat Argo", "Fiat Mobi", "Hyundai Hb20"};
        double[] valorDiaria = {98.00, 79.00, 102.00};
        double[] valorPorKm = {2.39, 1.99, 2.99};

        System.out.println("Escolha o veiculo desejado:");
        for (int i = 0; i < veiculos.length; i++) {
            System.out.println((i + 1) + ". " + veiculos[i]);
        }
        
        System.out.print("Opcao: ");
        int opcao = scanner.nextInt();
        
        System.out.print("Digite a quantidade de dias de aluguel: ");
        int diasAluguel = scanner.nextInt();
        
        System.out.print("Digite a quantidade de quilômetros rodados: ");
        int kmRodados = scanner.nextInt();

        double valorTotal = (valorDiaria[opcao - 1] * diasAluguel) + (valorPorKm[opcao - 1] * kmRodados);

        System.out.println("Valor total do aluguel: R$ " + valorTotal);

        scanner.close();
    }

}
