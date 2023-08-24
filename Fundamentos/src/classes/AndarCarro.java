/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class AndarCarro {
    public static void main(String[] args) {
        Carro carro01 = new Carro("Corsa", "Chevrolet", "preto", 2014, 4);
        carro01.andar(10);
        System.out.println(carro01);
    }
    
}
