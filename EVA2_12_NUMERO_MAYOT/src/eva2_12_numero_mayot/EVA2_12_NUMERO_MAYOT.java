/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_numero_mayot;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_NUMERO_MAYOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,lol=0;
        Scanner captu = new Scanner(System.in);
        
        do {
            System.out.print("Introduzca un numero entero positivo: ");
            num = captu.nextInt();
            
            if (num > lol) {
                lol = num;
            }
        } while (!(num == -1));
        System.out.println(lol);
    }
    
}
