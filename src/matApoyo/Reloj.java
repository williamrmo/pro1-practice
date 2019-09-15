/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matApoyo;

public class Reloj {
    public static void main(String[] args){
        int seg;
        int min;
        int hora;
        
        
        
        for(hora = 0; hora <= 23; hora++){
            // hora++;
            
            for(min = 0; min <= 59; min++){
                // min++;
                
                for(seg = 0; seg <= 59;seg++){
                    // seg++;

                    System.out.println(hora + " : " + min + " : " + seg);
                } // end seg
            } // end min
        } // end hora
    } // end main
} // end class
