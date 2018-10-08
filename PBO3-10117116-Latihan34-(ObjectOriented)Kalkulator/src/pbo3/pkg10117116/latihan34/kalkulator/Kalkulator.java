/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan34.kalkulator;



/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Kalkulator berbasis objek
 *  
 */
public class Kalkulator {
   
  public double value1;
  public double value2;
  
 
     
 
  
  public double tambahBilangan(double value1, double value2){
      System.out.println("");
      System.out.println("Hasil Pertambahan : " + (value1+value2));
      
      
     return (value1 + value2);
  }
  
  public double kurangBilangan (double value1, double value2) {
      System.out.println("Hasil Pengurangan : " + (value1-value2));
      
      
      return (value1 - value2);
      
  }
  
  public double kaliBilangan (double value1, double value2) {
      
      System.out.println("Hasil Perkalian : " + (value1 * value2));
      
      
      return (value1 * value2);
      
  }
  
  public double bagiBilangan (double value1, double value2) {
      
      System.out.println("Hasil Pembagian : " + (value1/value2));
      
      return (value1 / value2);
      
  }
  
  public double sisaBilangan (double value1, double value2) {
      
      System.out.println("Hasil Sisa : " + (value1 % value2));
      
      return (value1 %  value2);
      
  }
  
  
  
  
    
}
