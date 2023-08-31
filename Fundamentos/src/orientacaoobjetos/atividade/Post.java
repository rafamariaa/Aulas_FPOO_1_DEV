/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos.atividade;

/**
 *
 * @author Aluno
 */
public class Post implements ClassificacaoPost{
    private String descricao;
    private int curtida;
    private int comentarios;
    private int ClassificacaoPost;

    public Post(String descricao, int curtida, int comentarios) {
        this.descricao = descricao;
        this.curtida = curtida;
        this.comentarios = comentarios;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCurtida() {
        return curtida;
    }

    public int getComentarios() {
        return comentarios;
    }

    public int getClassificacaoPost() {
        return ClassificacaoPost;
    }
    
    @Override
    public boolean classificarEstrela(int ClassificarPost) {
         if (ClassificacaoPost == 1) {
            System.out.println("Comum");
            return true;
        }
        if (ClassificacaoPost == 3) {
            System.out.println("Legal");
            return true;
        }
        if (ClassificacaoPost == 5) {
            System.out.println("Super legal");
            return true;
        }else{
            System.out.println("Sem avaliação");
            return false;
        }
    }
    
    @Override
    public boolean validarNome(String descricao) {
        if (descricao.length() > 100) {
            System.out.println("Limite de caracteres atingido");
            return true;
        } else {
             System.out.println("Esta dentro do limite de caracteres");
            return false;
        }
    }

    @Override
    public String toString() {
        return "RedeSocial{" + "Descricao = " + descricao + ", Curtida = " + curtida + ", Comentarios = " + comentarios + ", Classificacao do Post = " + ClassificacaoPost + '}';
    }
   
}
