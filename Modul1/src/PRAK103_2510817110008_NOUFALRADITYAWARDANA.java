import java.util.Scanner;

public class PRAK103_2510817110008_NOUFALRADITYAWARDANA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int angkaAwal = input.nextInt();

        int count = 0;
        int angka = angkaAwal;

        do {
            if (angka % 2 != 0) {
                if (count == 0) {
                    System.out.print(angka);
                } else {
                    System.out.print(", " + angka);
                }
                count++;
            }
            angka++;
        } while (count < N);

        System.out.println();
        input.close();
    }
}