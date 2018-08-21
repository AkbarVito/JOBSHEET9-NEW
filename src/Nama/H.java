/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nama;

/**
 *
 * @author asus
 */
public class H {
    public static void main(String[] args){
        int sp;
        for (sp = 0; sp < 2; sp++){
            System.out.println("");
        }
        for (int h = 0; h < 2; h++){
            System.out.print("##");
            for (int h1 = 0; h1 < 4; h1++){
                System.out.print(" ");
            }
            System.out.println("##");
        }//h atas
        for (int h2 = 0; h2 < 8; h2++){
            System.out.print("#");
        }//h tengah
        System.out.println("");
        for (int h = 0; h < 2; h++){
            System.out.print("##");
            for (int h1 = 0; h1 < 4; h1++){
                System.out.print(" ");
            }
            System.out.println("##");
        }//h bawah
    }
    
}
