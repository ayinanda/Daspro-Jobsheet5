import java.util.Scanner;
public class Siakad09 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nama, nim, Prodi;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.println("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan nim: ");
        nim = sc.nextLine();
        System.out.println("Masukkan prodi: ");
        Prodi = sc.nextLine();
        System.out.println("Masukkan kelas: ");
        kelas = sc.nextLine(). charAt(0);
        System.out.println("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.println("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis*0.20 + nilaiTugas*0.15 + nilaiUTS*0.30 + nilaiUAS*0.35);

        System.out.println("Nama:" + nama + "nim:" + nim);
        System.out.println("kelas:" + kelas + "absen:" + absen);
        System.out.println("Nilai akhir:" + nilaiAkhir);
    }
}