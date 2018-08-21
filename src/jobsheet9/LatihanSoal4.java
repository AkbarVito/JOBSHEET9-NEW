/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class LatihanSoal4 {
    public static double hitung(double bil1, double bil2){
     return bil1 / bil2 ;
    } 
     public static void main(String[] args){
         Scanner masukan = new Scanner(System.in);
         System.out.println("Masukkan jarak dan waktu");
         
         double X = hitung(masukan.nextDouble(),masukan.nextDouble());
         System.out.println("Kecepatan Anda = "+X+"km/jam");
    
    
}}
