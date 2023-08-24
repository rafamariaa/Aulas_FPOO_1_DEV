/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class ClassesComputador {
    private EnumMemoria memoria;
    private EnumProcessador processador;
    private double capacidadeDiscoRigido;
    private String sistemaOperacional;

    public ClassesComputador(EnumMemoria memoria, EnumProcessador processador, double capacidadeDiscoRigido, String sistemaOperacional) {
        this.memoria = memoria;
        this.processador = processador;
        this.capacidadeDiscoRigido = capacidadeDiscoRigido;
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return "ClassesComputador{" + "memoria=" + memoria + ", processador=" + processador + ", capacidadeDiscoRigido=" + capacidadeDiscoRigido + ", sistemaOperacional=" + sistemaOperacional + '}';
    }
    
  



    
}
