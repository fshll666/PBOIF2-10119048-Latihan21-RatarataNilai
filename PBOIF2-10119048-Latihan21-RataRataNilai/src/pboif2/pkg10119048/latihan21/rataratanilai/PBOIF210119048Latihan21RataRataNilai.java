/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan21.rataratanilai;

import java.util.Scanner;
/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Program Rata-rata Nilai
 */
public class PBOIF210119048Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner(System.in);
        
        int i, n;
        float jum, x, rata;
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        n = masuk.nextInt();
        jum = 0;
        i = 1;
        while (i<=n){
                System.out.print("Nilai Mahasiswa ke-" + i +" : ");
                x = masuk.nextFloat();
                jum += x;
                i++;
        }
        rata = jum / n;
        System.out.println("Maka,Rata-rata Nilainya adalah " + rata);
        
        System.out.println("==========================================");
        System.out.println("Developed by : Mochammad Faishal");
    }
    
}
