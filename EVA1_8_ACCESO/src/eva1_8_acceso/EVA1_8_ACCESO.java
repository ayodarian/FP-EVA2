/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_acceso;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_8_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String contra,usu;
        Scanner captu = new Scanner(System.in);
        do{
        System.out.print("Introduzca el usuario: ");
        usu = captu.nextLine();
        System.out.print("Introduzca la contraseña: ");
        contra = captu.nextLine();
        }while(!(usu.equals("admin") && contra.equals("1234")));
        //Pantalla de validacion: usuario y contraseña
        
        //Programa principal:
        System.out.println("PROGRAMA PRINCIPAL");
        
    }
    
}
