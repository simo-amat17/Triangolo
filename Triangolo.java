/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangolo;

import java.util.Scanner;

/**
 *
 * @author Amatucci Simone 4INB 12/1/2017
 */
public class Triangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float L1;
        float L2;
        float L3;
        do {
            System.out.println("Inserire primo lato: ");
            L1 = input.nextFloat();
        } while (L1 <= 0);
        do {
            System.out.println("Inserire secondo lato: ");
            L2 = input.nextFloat();
        } while (L2 <= 0);
        do {
            System.out.println("Inserire terzo lato: ");
            L3 = input.nextFloat();
        } while ((L3 <= 0) || (L3 > (L1 + L2)));
        float perimetro = (L1 + L2 + L3);
        System.out.println("Il perimetro vale: " + perimetro);
        float base;
        float altezza;
        do {
            System.out.println("Inserire altezza: ");
            altezza = input.nextFloat();
        } while (altezza <= 0);
        do {
            System.out.println("Inserire base: ");
            base = input.nextFloat();
        } while (base <= 0);
        float area = ((base * altezza) / 2);
        System.out.println("L' area vale: " + area);
    }

}
