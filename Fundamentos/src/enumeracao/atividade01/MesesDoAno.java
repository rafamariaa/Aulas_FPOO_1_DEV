/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividade01;

/**
 *
 * @author Aluno
 */
public enum MesesDoAno {
   JANEIRO("Janeiro"),
   FEVEREIRO("Fevereiro"),
   MARCO("Março"),
   ABRIL("Abril"), 
   MAIO("Maio"),
   JUNHO("Junho"), 
   JULHO("Julho"), 
   AGOSTO("Agosto"), 
   SETEMBRO("Setembro"), 
   OUTUBRO("Outubro"), 
   NOVEMBRO("Novembro"),
   DEZEMBRO("Dezembro");
   
   private String status;

    private MesesDoAno(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
    
    
    
}
