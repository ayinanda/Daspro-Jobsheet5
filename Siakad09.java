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

        String nilaiAkhirHuruf;
        String kualifikasi;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiAkhirHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiAkhirHuruf = "B+";
            kualifikasi = "Lebih dari baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiAkhirHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiAkhirHuruf = "C+";
            kualifikasi = "Lebih dari cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiAkhirHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiAkhirHuruf = "D";
            kualifikasi = "Kurang";
        } else  {
            nilaiAkhirHuruf = "F";
            kualifikasi = "Gagal";
        }{
            
        }

        System.out.print(" Mahasiswa dengan nama : " + nama + "NIM : " + nim + "Kelas : " + kelas + "Nomor absen : " + absen);
        System.out.print("Nilai akhir:" + nilaiAkhir);
        System.err.print("Nilai Akhir Huruf : " + nilaiAkhirHuruf);
        System.out.print("Kualifikasi : " + kualifikasi );
    }
}