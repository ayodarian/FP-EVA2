/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_16_ciclos_arreglos;

/**
 *
 * @author invitado
 */
public class EVA2_16_CICLOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos,x,y,z; //Todos son arreglos
        int val1,val2,arreglo[]; //SOLO arreglo es Arreglo
        
        arreglo = new int[10];
        
        for (int i = 0; i < 10; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        //IMPRIMIMOS LOS NUMEROS
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
}
