package soal1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.nextLine();
        String ras = scanner.nextLine();

        HewanPeliharaan hewan = new HewanPeliharaan(ras, nama);

        hewan.display();

        scanner.close();
    }
}