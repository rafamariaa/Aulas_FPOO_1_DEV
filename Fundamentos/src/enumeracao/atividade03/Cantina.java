/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade03;

/**
 *
 * @author Aluno
 */
public class Cantina {
    private ProdutosCantina produtosCantina;
    private double valor;
    private int qtde;

    public Cantina(ProdutosCantina produtosCantina, double valor, int qtde) {
        this.produtosCantina = produtosCantina;
        this.valor = valor;
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return "Cantina{" + "produtosCantina=" + produtosCantina + ", valor=" + valor + ", qtde=" + qtde + '}';
    }
    
}
