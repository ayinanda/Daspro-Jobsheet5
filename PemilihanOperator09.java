import java.util.Scanner;

public class PemilihanOperator09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("=== Masukkan angka 1: ====");
        angka1 = sc.nextDouble();
        System.out.println("==== Masukkan angka 2: ====");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan operator (+ , _ , * , / )");
        operator = sc.next().charAt(0);

        if (operator == '+') {
            hasil = angka1 + angka2 ;

        } else if (operator == '-') {
            hasil = angka1 - angka2 ;
        
        } else if (operator == '*') {
            hasil = angka1*angka2;

        } else if (operator == '/') 
        if (angka2 !=0 ) {
           hasil = angka1/angka2; 
        } else {
            System.out.print("==== Error: Pembagian dengan nol tidak diperbolehkan =====");
        }{
            System.out.print(angka1 + "" + operator + "" + angka2 + "=" + hasil );
        } {
            
        } {
            
        } {
            
        }

    }
}
