/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica6;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PRACTICA6 {

    public static void main(String[] args) {
       int num;
       Scanner captu = new Scanner(System.in);
       System.out.print("Introduzca un numero: ");
       num = captu.nextInt();
       captu.nextLine();
       String acum = "";
       for (int i = 0; i <= num; i++) {
        System.out.println(acum);
            acum = acum + "*";
            }
        for (int i = num - 1; i >= 1; i--) {
            for (int d = 1; d <= i; d++) {
                System.out.print("*");   
            }
            System.out.println();
        }
    }
}
