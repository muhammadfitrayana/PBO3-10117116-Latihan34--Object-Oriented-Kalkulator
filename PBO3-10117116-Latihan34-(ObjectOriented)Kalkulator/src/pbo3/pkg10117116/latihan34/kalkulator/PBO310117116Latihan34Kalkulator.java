/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Kalkulator berbasis objek
 *  
 */
public class PBO310117116Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double value1, value2;
        
        Scanner baca = new Scanner(System.in);
        
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukan Angka Ke-1 : ");
        value1 = baca.nextDouble();
        
        System.out.print("Masukan Angka Ke-2 : ");
        value2 = baca.nextDouble();
        
        Kalkulator kalku = new Kalkulator();
        kalku.tambahBilangan(value1, value2);
        kalku.kurangBilangan(value1, value2);
        kalku.kaliBilangan(value1, value2);
        kalku.bagiBilangan(value1, value2);
        kalku.sisaBilangan(value1, value2);
        
        
        
    }
    
}
