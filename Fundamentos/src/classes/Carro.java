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
    private CorEnum cor;
    private int ano;
    private int qtdeRodas;
    private int marcha;
    private boolean estaEmRe;
    private String situacao;
    private int velocidade;
    


    public Carro(String modelo, String marca, CorEnum cor, int marcha, boolean estaEmRe, int ano, int qtdeRodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.marcha = marcha;
        this.estaEmRe = estaEmRe;
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
    
    public void trocarDeMarcha(MarchaEnum novaMarcha){
        int diferenca = novaMarcha.getNumeroMarcha() - this.marcha;
        
        if (diferenca == 1) {
            this.marcha = novaMarcha.getNumeroMarcha();
            
        } else {
            System.out.println("Você não pode pular a marcha");
        }
    }
    public void engatarRe(boolean re){
        this.estaEmRe = re;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", qtdeRodas=" + qtdeRodas + ", marcha=" + marcha + ", estaEmRe=" + estaEmRe + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }  
    
}
