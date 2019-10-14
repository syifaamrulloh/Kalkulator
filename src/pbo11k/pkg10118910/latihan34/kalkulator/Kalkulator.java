/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan34.kalkulator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Muhamad Syifa Amruloh
 * KELAS    : IF11K
 * NIM      : 10118910
 * 
 * Deskripsi Program : Program ini berisi program Kalkulator Dasar
 * dengan konsep Objek
 */
public class Kalkulator {

    public double value1=2,value2=2;
    
    public double tambahBilangan(){
        double hasil = value1 + value2;
        return hasil;
    }
    public double sisaBilangan(){
        double hasil = value1 % value2;
        return hasil;
    }
    public double kurangBilangan(){
        double hasil = value1 - value2;
        return hasil;
    }
    public double kaliBilangan(){
        double hasil = value1 * value2;
        return hasil;
    }
    public double bagiBilangan(){
        double hasil = value1 / value2;
        return hasil;
    }
    public static void main(String[] args) {
        //INISIALISASI OBJEK
        Kalkulator kl = new Kalkulator();
        //LOAD SCANNER
        Scanner input = new Scanner(System.in);
        DecimalFormat bg = new DecimalFormat("#.##");
        //INPUT
        System.out.println("========== APLIKASI KALKULATOR BILANGAN =========");
        System.out.print("Masukan Angka ke-1 : ");
        kl.value1 = input.nextDouble();
        System.out.print("Masukan Angka ke-2 : ");
        kl.value2 = input.nextDouble();
       //OUTPUT
        System.out.println("\nHasil Pertambahan\t: " + kl.tambahBilangan());
        System.out.println("Hasil Pengurangan\t: " + kl.kurangBilangan());
        System.out.println("Hasil Perkalian\t\t: " + kl.kaliBilangan());
        System.out.println("Hasil Pembagian\t\t: " + bg.format(kl.bagiBilangan()).replace('.',','));
        System.out.println("Hasil Sisa\t\t: " + kl.sisaBilangan());
    }
    
}
