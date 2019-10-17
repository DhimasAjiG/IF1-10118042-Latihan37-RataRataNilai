
package if1.pkg10118042.latihan37.rataratanilai;
import java.util.Scanner;

public class NilaiMhs {
    public int nilai;
    public double jmlNilai;
    
    Scanner masuk = new Scanner(System.in);
    
    public double hitungNilai(int parNilai, int parJmlMhs){
        for(int i=1;i<=parJmlMhs;i++){
            System.out.print("Nilai mahasiswa ke-"+i+" : ");
            parNilai = masuk.nextInt();
            jmlNilai += parNilai;
        }
        return jmlNilai;
    }
    
    public double hitungRataRata(double jmlNilai,int jmlMhs){
        return jmlNilai/jmlMhs;
    }
}

