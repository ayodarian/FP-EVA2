/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_5_break_continue;

/**
 *
 * @author invitado
 */
public class EVA2_5_BREAK_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i < 10; i++) {
            if(i == 8)
                //continue; // detiene la iteracion acutal
                break; // detiene el ciclo en este punto
            System.out.print(i + " - ");
        }
    }
    
}
