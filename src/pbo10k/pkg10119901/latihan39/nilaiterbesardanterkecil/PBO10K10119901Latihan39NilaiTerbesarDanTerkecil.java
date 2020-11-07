/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Mengnampilkan nilai terbesar dan terkecil
 *
 */
public class PBO10K10119901Latihan39NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs   = new Mahasiswa();
        Scanner scanner = new Scanner(System.in);
        
        String namaPetugas;
        int jumlahMahasiswa, nilaiMahasiswa[];

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scanner.nextLine();

        System.out.print("Masukkan Banyaknya Jumlah Nilai Mahasiswa : ");
        jumlahMahasiswa = scanner.nextInt();

        nilaiMahasiswa = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) 
        {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }
        
        mhs.hasilNilaiMahasiswa(jumlahMahasiswa, nilaiMahasiswa);

        System.out.println();
        System.out.println("Nilai Terbesar adalah " + mhs.getNilaiTerbesar());
        System.out.println("Nilai Terkecil adalah " + mhs.getNilaiTerkecil());
        System.out.println("\nPetugas : " + namaPetugas);
    }
}
