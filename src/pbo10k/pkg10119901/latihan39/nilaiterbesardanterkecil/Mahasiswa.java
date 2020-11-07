/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan39.nilaiterbesardanterkecil;

/**
 *
 * @author User
 */
public class Mahasiswa 
{
    private static int nilaiTerkecil = 0;
    private static int nilaiTerbesar = 0;
    
    public static int getNilaiTerkecil()
    {
        return nilaiTerkecil;
    }
    
    private static void setNilaiTerkecil(int nilaiTerkecil)
    {
        Mahasiswa.nilaiTerkecil = nilaiTerkecil;
    }
    
    public static int getNilaiTerbesar()
    {
        return nilaiTerbesar;
    }
    
    private static void setNilaiTerbesar(int nilaiTerbesar)
    {
        Mahasiswa.nilaiTerbesar = nilaiTerbesar;
    }
    
    public static void hasilNilaiMahasiswa(int jumlahMahasiswa, int[] nilaiMahasiswa)
    {
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        
        nilaiTerkecil = nilaiMahasiswa[0];
        
        for (int i = 0; i < jumlahMahasiswa; i++) 
        {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);

            if (nilaiMahasiswa[i] < nilaiTerkecil) 
            {
                setNilaiTerkecil(nilaiMahasiswa[i]);
            }

            if (nilaiMahasiswa[i] > nilaiTerbesar) 
            {
                setNilaiTerbesar(nilaiMahasiswa[i]);
            }
        }
    }
}
