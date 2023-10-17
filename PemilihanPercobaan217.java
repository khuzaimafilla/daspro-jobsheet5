import java.util.Scanner;

public class PemilihanPercobaan217 {
    public static void main(String[] args) {

        //Deklarasi Scanner
        Scanner input17 = new Scanner(System.in);

        System.out.print("Nilai UAS : ");
        float uas = input17.nextFloat();
        System.out.print("Nilai UTS : ");
        float uts = input17.nextFloat();
        System.out.print("Nilai KUIS : ");
        float kuis = input17.nextFloat();
        System.out.print("Nilai TUGAS : ");
        float tugas = input17.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println(" Nilai Akhir : " + total + " sehingga " + message);



    }
}
