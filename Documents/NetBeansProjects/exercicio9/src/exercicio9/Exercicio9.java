/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Circulo circulo1 = new Circulo();
        
        System.out.println("informe o valor do raio:");
       circulo1.setRaio(ler.nextDouble());
        
       circulo1.mostrarResultados();
        System.out.println("Valor do raio informado:"+circulo1.getRaio());
    }
    
}
