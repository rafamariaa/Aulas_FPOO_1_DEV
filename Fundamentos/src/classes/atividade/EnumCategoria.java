/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public enum EnumCategoria {
    LICENCIATURA("Licenciatura"),
    TECNICO("Técnico"),
    BACHARELADO("Bacharelado");
    
    private String categoria;
    
    private EnumCategoria(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
    
    
}
