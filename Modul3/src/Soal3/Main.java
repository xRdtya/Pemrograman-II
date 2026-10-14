package Soal3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            pilihan = Integer.parseInt(scanner.nextLine());

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = scanner.nextLine();

                    Mahasiswa mhsBaru = new Mahasiswa(nama, nim);
                    daftarMahasiswa.add(mhsBaru);
                    System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = scanner.nextLine();
                    boolean ditemukanHapus = false;

                    for (int i = 0; i < daftarMahasiswa.size(); i++) {
                        if (daftarMahasiswa.get(i).getNim().equals(nimHapus)) {
                            daftarMahasiswa.remove(i);
                            ditemukanHapus = true;
                            System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                            break;
                        }
                    }

                    if (!ditemukanHapus) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String nimCari = scanner.nextLine();
                    boolean ditemukanCari = false;

                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNim().equals(nimCari)) {
                            System.out.println("Data Ditemukan:");
                            System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
                            ditemukanCari = true;
                            break;
                        }
                    }

                    if (!ditemukanCari) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("(Belum ada data mahasiswa)");
                    } else {
                        for (Mahasiswa mhs : daftarMahasiswa) {
                            System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}