/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class Atividades {
    public static void main(String[] args) {
        ClassesSala sala01 = new ClassesSala(30, 30, 3, true, 10);
        sala01.estaSendoUsada();
        System.out.println(sala01);
        
        
        ClassesCurso curso01 = new ClassesCurso("Adiministraçao", "Adiministraçao e a tomada de descisao sobre recursos disponiveis...", EnumCategoria.TECNICO);
        System.out.println(curso01);
        
        
        ClassesComputador computador01 = new ClassesComputador(EnumMemoria.MEMORIA3, EnumProcessador.INTEL_ATOM, 600, "windows");
        System.out.println(computador01);
    }
    
    
    
    
}
