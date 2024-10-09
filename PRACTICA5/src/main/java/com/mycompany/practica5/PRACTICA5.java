/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica5;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PRACTICA5 {

    public static void main(String[] args) {
        int num;
        Scanner captu = new Scanner(System.in);
       System.out.print("Introduzca un numero: ");
        num = captu.nextInt();
        captu.nextLine();
        String acum;
        acum = "*";
        for (int i = 0; i <= num; i++) {
         System.out.println(acum);
            acum = acum + "*";
        }
    }
}
