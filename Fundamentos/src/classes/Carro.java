/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {
    private String modelo;
    private String marca;
    private String cor;
    private int ano;
    private int qtdeRodas;
    private String situacao;
    private int velocidade;

    public Carro(String modelo, String marca, String cor, int ano, int qtdeRodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.qtdeRodas = qtdeRodas;
        this.situacao = "parado";
        this.velocidade = 0;
    }
    
    
    
       //ações do carro 
    public void andar(int velocidade){
        this.situacao = "Andando";
        this.velocidade = velocidade;
    }
    public void freiar(){
        this.situacao = "Freiando";
        this.velocidade -= 1;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", qtdeRodas=" + qtdeRodas + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }
    
    
    
}
