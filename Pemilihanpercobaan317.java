import java.util.Scanner;

public class Pemilihanpercobaan317 {
    /**
     * InnerPemilihanpercobaan317
     */
    public class InnerPemilihanpercobaan317 {
    
        public static void main(String[] args) {
            
            //Deklarasi Scanner
            Scanner input17 = new Scanner(System.in);

            double angka1, angka2, hasil;
            char operator;

            System.out.print("Masukkan angka pertama : ");
            angka1 = input17.nextDouble();
            System.out.print("Masukkan angka kedua : ");
            angka2 = input17.nextDouble();
            System.out.print("Masukkan operator (+ - *): ");
            operator = input17.next().charAt(0);

            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                    break;
                case '/':
                    hasil = angka1 / angka2;
                    System.out.println(angka1 + " / " + angka2 + hasil);
                    break;
            }
        }
    }
}
