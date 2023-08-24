/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public enum EnumMemoria {
    MEMORIA1 ("4G"),
    MEMORIA2("16G"),
    MEMORIA3("64G"),
    MEMORIA4("128G");
    
    private String memoria;
    private EnumMemoria(String memoria){
        this.memoria = memoria;
    }

    public String getMemoria() {
        return memoria;
    }
    
    
}
