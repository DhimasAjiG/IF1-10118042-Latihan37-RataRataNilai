
package if1.pkg10118042.latihan37.rataratanilai;

import java.util.Scanner;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk mencari nilai rata rata dari seorang mahasiswa  
 * 
 */
public class IF110118042Latihan37RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NilaiMhs mhs = new NilaiMhs();
        Scanner masuk = new Scanner(System.in);
        
        int jmlMhs;
        System.out.print("Masukkan Banyaknya Mahasiwa : ");
        jmlMhs = masuk.nextInt();
        
        mhs.hitungNilai(mhs.nilai, jmlMhs);
        mhs.hitungRataRata(mhs.jmlNilai, jmlMhs);
        
        System.out.printf("%nMaka, Rata-rata nilainya adalah : %.1f",mhs.hitungRataRata(mhs.jmlNilai, jmlMhs));
        System.out.println();
        System.out.println("Developed by : Dhimas Aji Ghairrahmat");
    }

}