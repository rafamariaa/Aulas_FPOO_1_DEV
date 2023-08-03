
package atividade02;


public class CalcularValor {
    public static void main(String[] args) {
        Valor produto1 = new Valor("rafaella", 10, 4);
       
        double valorTotal = produto1.CalculaValor();
        System.out.println("O valor total é: " + valorTotal );
        
   
    }
    

    
}
