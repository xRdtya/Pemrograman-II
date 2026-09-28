import java.util.Scanner;

public class PRAK102_2510817110008_NOUFALRADITYAWARDANA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angkaAwal = input.nextInt();

        int i = 0;
        int angka = angkaAwal;

        while (i < 11) {
            int hasil;

            if (angka % 5 == 0) {
                hasil = (angka / 5) - 1;
            } else {
                hasil = angka;
            }

            if (i == 0) {
                System.out.print(hasil);
            } else {
                System.out.print("," + hasil);
            }

            angka++;
            i++;
        }

        System.out.println();
        input.close();
    }
}