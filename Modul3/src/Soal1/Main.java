package Soal1;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Dadu> daftarDadu = new LinkedList<>();

        System.out.print("Masukkan jumlah dadu: ");
        int jumlahDadu = scanner.nextInt();

        int totalNilai = 0;

        for (int i = 1; i <= jumlahDadu; i++) {
            Dadu daduBaru = new Dadu();
            daftarDadu.add(daduBaru);

            int nilaiDadu = daduBaru.getNilai();
            totalNilai += nilaiDadu;

            System.out.println("Dadu ke-" + i + " bernilai " + nilaiDadu);
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);

        scanner.close();
    }
}