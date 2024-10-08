/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class PRACTICA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner captu = new Scanner(System.in);
        System.out.print("Ingrese el numero 1:");
        num1 = captu.nextInt();
        System.out.print("Ingrese el numero 2:");
        num2 = captu.nextInt();
       
        for (int i = num1; i<= num2; i++) {
            System.out.println(i);
       }
        for (int i = num2; i>= num1; i--) {
            System.out.println(i);
       }
       
    }
    
}
