/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan39.terbesarterkecil;
import java.util.Scanner;

/**
 *
 * @author ENDOG
 *  Nama      : Muhamad Ramadan
 *  NIM       : 10119004
 *  Kelas     : IF1
 *  Deskripsi : menampilkan nilai terbesar terkecil
 */
class NilaiTerbesarTerkecil {
    private static Scanner scanner = new Scanner(System.in);
    private static String namaPetugas;
    private static int banyakNilaiMahasiswa;
    private static int nilaiMahasiswa[];
    private static int nilaiTerkecil = 0;
    private static int nilaiTerbesar = 0;
    
    private static String inputNamaMahasiswa() {
        System.out.println("=====Program Nilai Terbesar dan Terkecil Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scanner.nextLine();
        return namaPetugas;
    }
    
    private static int inputNilaiMahasiswa() {
        inputNamaMahasiswa();
        System.out.print("Masukkan Banyaknya Jumlah Nilai Mahasiswa : ");
        banyakNilaiMahasiswa = scanner.nextInt();

        nilaiMahasiswa = new int[banyakNilaiMahasiswa];

        for (int i = 0; i < banyakNilaiMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }
        return 0;
    }
    
        private static void cekNilaiTerbesarTerkecil() {
        inputNilaiMahasiswa();
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        nilaiTerkecil = nilaiMahasiswa[0];
        for (int i = 0; i < banyakNilaiMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);

            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }

            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
        }
    }
            
    public static void tampilNilaiMahasiswa() {
        cekNilaiTerbesarTerkecil();
        System.out.println();
        System.out.println("Nilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);

        System.out.println("\nPetugas : " + namaPetugas);
    }
    
}
