import java.util.Scanner;

public class PemilihanBilangan09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan sebuah angka ");
        int angka = sc.nextInt();

       String hasil = (angka % 2 == 0)? "Angka" + angka + "termasuk bilangan genap" : "Angka" +  angka  + " termasuk bilangan genap ";

       System.out.println(hasil);
    



    }
}