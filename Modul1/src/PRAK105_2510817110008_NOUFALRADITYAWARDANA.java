import java.util.Locale;
import java.util.Scanner;

public class PRAK105_2510817110008_NOUFALRADITYAWARDANA {
    public static final double PHI = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double t = input.nextDouble();

        double volume = PHI * r * r * t;

        System.out.printf(Locale.US, "Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3%n", r, t, volume);

        input.close();
    }
}