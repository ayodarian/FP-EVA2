/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_13_contar;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class EVA2_13_CONTAR {

    public static void main(String[] args) {
     String cad;
       int acum = 0;
        Scanner captu = new Scanner(System.in);
        System.out.print("Introduzca su cadena de texto:");
        cad = captu.nextLine();
        
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i)=='a' || cad.charAt(i)=='e'|| cad.charAt(i)=='i'|| cad.charAt(i)=='o'|| cad.charAt(i)=='u'
              || cad.charAt(i)=='A'|| cad.charAt(i)=='E'|| cad.charAt(i)=='I'|| cad.charAt(i)=='O'|| cad.charAt(i)=='U') {
                acum = acum + 1;
    }
}System.out.println(acum);
    }
}
