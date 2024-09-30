import java.util.Scanner;

public class Kafe09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
        float diskon = 10 / 100;

        System.out.println("Masukkan keanggotaan (true/false):");
        keanggotaan = input.nextBoolean();
        System.out.println("Masukkan jumlah pembelian kopi");
        jmlKopi = input.nextInt();
        System.out.println("Masukkan jumlah pembelian teh:");
        jmlTeh = input.nextInt();
        System.out.println("Masukkan jumlah pembelian roti:");
        jmlRoti = input.nextInt();
        
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        if (keanggotaan) {
            diskon = 10/100 ; // Diskon 10% untuk member
        }
        nominalBayar = totalHarga - (diskon * totalHarga);
        int nominalInt;
        nominalInt = (int) nominalBayar;


        System.out.println("Keanggotaan pelanggan:  " + keanggotaan);
        System.out.println("Item pembelian:  " + jmlKopi + "  kopi  "  + jmlTeh + " teh  " + jmlRoti + " roti");
        System.out.println("Total harga" + totalHarga);
        System.out.println("Diskon yang diberikan" + (diskon*totalHarga));
        System.out.println("Nominal bayar Rp" + nominalBayar);
        System.out.println("Nominal bayar (dalam int):  " + nominalInt);

        


    }
}