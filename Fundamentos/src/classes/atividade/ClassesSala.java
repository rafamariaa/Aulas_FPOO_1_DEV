/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class ClassesSala {
    private int numeroCadeiras;
    private int numeroMesas;
    private int numeroSala;
    private boolean temProjetor;
    private int numeroComputador;
    private String situacao;

    public ClassesSala(int numeroCadeiras, int numeroMesas, int numeroSala, boolean temProjetor, int numroComputador) {
        this.numeroCadeiras = numeroCadeiras;
        this.numeroMesas = numeroMesas;
        this.numeroSala = numeroSala;
        this.temProjetor = temProjetor;
        this.numeroComputador = numroComputador;
    }
    
    public void estaSendoUsada(){
        this.situacao = "Está sendo usada";
    }
    public void naoEstaSendoUsada(){
        this.situacao = "Não esta sendo usada";
    }

    @Override
    public String toString() {
        return "Sala{" + "numeroCadeiras=" + numeroCadeiras + ", numeroMesas=" + numeroMesas + ", numeroSala=" + numeroSala + ", temProjetor=" + temProjetor + ", numeroComputador=" + numeroComputador + ", situacao=" + situacao + '}';
    }

    
    
    
}
