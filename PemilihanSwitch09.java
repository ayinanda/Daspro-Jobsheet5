import java.util.Scanner;

public class PemilihanSwitch09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.println(" Masukkan angka 1:  ");
        angka1 = sc.nextDouble();
        System.out.println(" Masukkan angka 2:  " );
        angka2 = sc.nextDouble();
        System.out.println("Masukkan operator ( + - * :)");
        operator = sc.next(). charAt(0);

        boolean operatorValid = true;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2 ;
                break;
            case '-' :
                hasil = angka1 - angka2 ;
            case '*':
                hasil = angka1*angka2;
            case '/' :
                hasil = angka1/angka2;
            System.out.println("pembagian dengan nol tidak diperbolehkan");
            operatorValid = false; 
            default:
            System.out.print(" Operator yang dipilih tidak sesuai ");
            operatorValid = false;
                break;


        }
        System.out.println(angka1 + "" +  operator + "" + angka2 + "=" + hasil  );

    }
    
}
