/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade01;

/**
 *
 * @author Aluno
 */
public class Enumeracao {
    public static void main(String[] args) {
        QualMes meses = new QualMes(MesesDoAno.MAIO.getStatus());
        System.out.println( meses);
        
        Livro qualLivro = new Livro(NomeLivro.LIVRO2.getStatus(), 12.99);
        System.out.println(qualLivro);
        
        Redes qualRedes = new Redes(QualRede.WHATSAPP.getStatus(), 1111111111);
        System.out.println(qualRedes);
        
        Cantina qualProduto = new Cantina(ProdutosCantina.PRODUTO1.getStatus(), 10, 2);
        System.out.println(qualProduto);
    }
    
    
}
