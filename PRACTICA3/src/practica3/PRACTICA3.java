/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class PRACTICA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cad;
        Scanner captu = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        cad = captu.nextLine();
        
        for (int i = 0; i < cad.length(); i++) {
            System.out.println(cad.charAt(i));
        }
    }
    
}
