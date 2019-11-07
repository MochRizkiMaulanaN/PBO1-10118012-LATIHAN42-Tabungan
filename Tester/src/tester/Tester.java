/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import java.util.Scanner;

/**
 * NAMA      : Moch Rizki Maulana N
 * KELAS     : IF-1 
 * NIM       : 10118012
 * Deskripsi Program   : Program ini berisi program menghitung Saldo Tabungan
 *
 * @author Moch Rizki Maulana N
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== Program Penarikan Uang =====");
        System.out.print("Masukan Saldo Awal : ");
        int S=input.nextInt();
        Tabungan T = new Tabungan(S);
        System.out.print("Jumlah Unang Yang Diambil : ");
        int U =input.nextInt();
        T.ambilUang(U);
        System.out.println("Saldo Anda Sekarang : "+T.ambilUang(U));
    }
    
}
