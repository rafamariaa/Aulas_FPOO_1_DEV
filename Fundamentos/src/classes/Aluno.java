/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Aluno {
    private String nome;
    private String email;
    private int ra;
    private String situacao;

    public Aluno(String nome, String email, int ra) {
        this.nome = nome;
        this.email = email;
        this.ra = ra;
        this.situacao = situacao;
    }
    

    //ação do aluno 
    public void fezProva(){
        this.situacao = "Fez prova";
    }
    public void naoFez(){
        this.situacao = "Não fez prova";
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", ra=" + ra + ", situacao=" + situacao + '}';
    }
    
    
    
    
   
}
