/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg24550273_examen;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Juego piedra papel o tijera");
        System.out.println("Instrucciones: 1 = piedra, 2 = papel, 3 = tijera");
        System.out.println("Rondas ilimitadas (Para parar el juego teclee: 4 ");
        Scanner captu = new Scanner(System.in);
         int y=0, x=0;
        System.out.println("");
        do {
            System.out.println("Piedra, papel o tijera");
            System.out.println("Turno del usuario:");
             y = captu.nextInt();
             captu.nextLine();
             
             if (y != 1 && y!= 2 && y!= 3) {
                 System.out.println("NUMERO NO VALIDO (1-3)");
            System.out.println("Piedra, papel o tijera");
            System.out.println("Turno del usuario:");
            y = captu.nextInt();
            captu.nextLine();
            }
             
             System.out.println("Turno de la computadora:");
             double z = Math.random()*10;
             if (z == 1) {
                 System.out.println("PIEDRA");
            }
             System.out.println(z);
                 
        } while (y != 4);
        
    }
    
}
