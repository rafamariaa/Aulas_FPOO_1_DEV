package aulaetruturadecisao;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu cargo:"
                + "Gertente(G), Supervisor(S), Tecnico(T), Auxiliar(A)");
        char cargo = scanner.nextLine().toLowerCase().charAt(0);
        
        double salario = 0;
        double inss = 0 ;
        double convenio = 0;
        double descontos = 0;
        double salarioFinal = 0;
        
        if (cargo == 'G') {
            salario = 5590.0;
            inss = 8/100;
            convenio = 289.0;
            salarioFinal = salario * inss - convenio;
            System.out.println("Seu salario final no cargo de gerente sera de: R$" + salarioFinal);          
        } else if (cargo=='S'){
            salario = 5590.0;
            inss = 7/100;
            convenio = 239.0;
            salarioFinal = salario * inss - convenio;
            System.out.println("Seu salario final no cargo de Supervisor sera de: R$" + salarioFinal);
        } else if (cargo =='T'){
            salario = 3789.0;
            inss = 4/100;
            convenio = 189.0;
            salarioFinal = salario * inss - convenio;
            System.out.println("Seu salario final no cargo de tecnico sera de: R$" + salarioFinal);
        } else if (cargo=='A'){
            salario = 2345.0;
            inss = 2/100;
            convenio = 156.0;
            salarioFinal = salario * inss - convenio;
            System.out.println("Seu salario final no cargo de Auxiliar sera de: R$" + salarioFinal);
        }
        
    }
    
}


