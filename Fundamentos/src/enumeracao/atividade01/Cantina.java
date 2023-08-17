/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade01;

/**
 *
 * @author Aluno
 */
public class Cantina {
    private String status;
    private double valor;
    private int qtde;

    public Cantina(String status, double valor, int qtde) {
        this.status = status;
        this.valor = valor;
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return "Cantina{" + "produtosCantina=" + status + ", valor=" + valor + ", qtde=" + qtde + '}';
    }
    
}
