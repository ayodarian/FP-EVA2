/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_potencias;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_POTENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base, expo;
        Scanner captu = new Scanner(System.in);
        System.out.print("introduce tu base:");
        base = captu.nextInt();
        captu.nextLine();
        System.out.print("Introduce tu potencia:");
        expo = captu.nextInt();
        captu.nextLine();
        
        int acum =1;
        for (int i = 1; i<= expo; i++) {
            acum = acum*base;
        }
        System.out.println(acum);
    }
    
}
