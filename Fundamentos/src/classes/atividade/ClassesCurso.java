/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class ClassesCurso {
    private String nome;
    private String descricao;
    private EnumCategoria categoria;
    private boolean Vagas;

    public ClassesCurso(String nome, String descricao, EnumCategoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ClassesCurso{" + "nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria + ", Vagas=" + Vagas + '}';
    }
    
    
    
    

    
}
