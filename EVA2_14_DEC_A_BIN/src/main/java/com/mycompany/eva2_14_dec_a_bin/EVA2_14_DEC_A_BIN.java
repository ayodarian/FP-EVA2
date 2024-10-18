/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_dec_a_bin;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class EVA2_14_DEC_A_BIN {

    public static void main(String[] args) {
      int num1, bina, num2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingrese un numero para cambiar a binario");
        num1 = captu.nextInt();
        captu.nextLine();
        String acum = "";
        while (num1 !=0){
        bina = num1%2;
        num2 = num1 / 2;
        num1 = num2;
        acum = bina + acum;
} System.out.println(acum);
}
}
