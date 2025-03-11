/*


Peça ao usuário para inserir uma temperatura em graus Fahrenheit.
Converta essa temperatura para Celsius usando a fórmula:
Imprima a temperatura convertida.

 */
package javaapplication123;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JavaApplication123 {

    public static void main(String[] args) {

         //Declarar variáveis
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        double x1, y1, z1, x2, y2, z2, distancia;
        //Entrada de dados
        System.out.println("Insira a primeira cordenada: ");
        x1 = ler.nextDouble();
        y1 = ler.nextDouble();
        z1 = ler.nextDouble();
        System.out.println("Insira a segunda cordenada: ");
        x2 = ler.nextDouble();
        y2 = ler.nextDouble();
        z2 = ler.nextDouble();
        //Processamento
        distancia = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2) + Math.pow((z1-z2), 2)) ;
        //Saida de dados 
        System.out.println("A distância entre os pontos é de:" + decimal.format(distancia));



    }

}
