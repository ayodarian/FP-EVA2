/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_PROMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int acum, cali;
        Scanner captu = new Scanner(System.in);
        acum = 0;
        for (int i = 1; i<=20; i++) {
            System.out.println("Estudiante #" + i);
            System.out.println("Introduce tu calificacion");
        cali = captu.nextInt();
        captu.nextLine();
        acum = acum + cali;
        }
        System.out.println("acum = " + acum);
        System.out.println("El promedio es: " + acum/20);
       
    }
    
}
