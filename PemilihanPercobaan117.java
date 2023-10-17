import java.util.Scanner;

/**
 * PemilihanPercobaan117
 */
public class PemilihanPercobaan117 {

    public static void main(String[] args) {

        // deklarasi scanner
        Scanner input17 = new Scanner(System.in);

        System.out.println("Masukkan Nama : ");
        int angka = input17.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " Bilangan Genap");
        } else {
            System.out.println("Angka " + angka + " Bilangan Ganjil");
        }


    }
}