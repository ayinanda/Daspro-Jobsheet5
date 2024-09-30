import java.util.Scanner;
public class PemilihanHariDenganIf09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nomorHari;

        System.out.print(" Masukkan angka (1-7: )");
        nomorHari = scanner.nextInt();

        if (nomorHari >= 1 && nomorHari <=5) {
            System.out.println("Weekday");
        } else if (nomorHari == 6 || nomorHari == 7){
            System.out.println("Weekend");
        } else {
            System.out.println(" Invalid number ");
        }
            
    }
}