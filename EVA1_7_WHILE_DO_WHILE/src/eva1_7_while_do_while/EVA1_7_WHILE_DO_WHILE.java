/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_while_do_while;

/**
 *
 * @author invitado
 */
public class EVA1_7_WHILE_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // FOR ---> Sabemos la cantidad de repeticiones
        //WHILE ---> CERO o MAS repeticiones
        //DO WHILE ---> UNA o MAS repeticiones
        
        //WHILE: 
        System.out.println("WHILE");
       int val = 1;
        while(val <= 10){
            System.out.print(val + " - ");
            val++;
        }
        System.out.println("");
        //DO WHILE:
        val = 1;
        System.out.println("DO WHILE");
        do {
            System.out.print(val + " - ");
            val++;
        } while (val<=10);//REPITE ESTAS INSTRUCCIONES MIENTRAS () SEA VERDADERO
    }
    
}
