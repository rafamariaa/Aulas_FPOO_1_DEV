/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade01;

/**
 *
 * @author Aluno
 */
public class Livro {
    private String  status;
    private double valor;

    public Livro(String status, double valor) {
        this.status = status;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Livro{" + "status=" + status + ", valor=" + valor + '}';
    }

    

    
    
    
}
