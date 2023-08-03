
package atividade02;


public class Valor {
    private String nome;
    private double valor;
    private double qtde;
    private String formaPagamento;
    private double valorTotal;

    public Valor(String nome, double valor, double qtde) {
        this.nome = nome;
        this.valor = valor;
        this.qtde = qtde;        
    }  

    public Valor(String formaPagamento) {
        this.formaPagamento = "D";
        if (valorTotal <= 100) {
            double desconto = valorTotal - (valorTotal * 0.5) ;
            System.out.println("Valor final é: " + desconto);
            
        } else {
            double desconto = valorTotal - (valorTotal * 0.3) ;
            System.out.println("Valor final é: " + desconto);
        }
    }   
    public double CalculaValor(){
        this.valorTotal = (this.valor * this.qtde) ;
        return this.valorTotal;
    
    }
    
}
