/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade01;

/**
 *
 * @author Aluno
 */
public enum QualRede {
    INSTAGRAM("Instagram"),
    WHATSAPP("Whats App"),
    TWITTER ("Twitter");
    
    private String status;

    private QualRede(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
    
}
