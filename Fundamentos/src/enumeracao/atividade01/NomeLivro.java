/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade01;

/**
 *
 * @author Aluno
 */
public enum NomeLivro {
     LIVRO1("Chapeuzinho vermelho"),
     LIVRO2("Cinderela"),
     LIVRO3("Branca de neve e os 7 anões"),
     LIVRO4("Pinoquio"), 
     LIVRO5("Bela e a fera");
     
    private String status;

    private NomeLivro(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
    
    
}
