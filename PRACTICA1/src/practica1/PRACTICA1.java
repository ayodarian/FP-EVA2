/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class PRACTICA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cade;
        int num;
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingresa una cadena de texto");
        cade = captu.nextLine();
        System.out.println("¿Cuantas veces se repite la cadena de texto?");
        num = captu.nextInt();
        captu.nextLine();
        
        for (int i = 1; i <= num; i++ ) {
            System.out.println(cade);
        }
    }
    
}
