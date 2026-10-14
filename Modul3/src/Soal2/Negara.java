package Soal2;
import java.util.HashMap;

public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }

    public String getNamaPemimpin() {
        return namaPemimpin;
    }

    public int getTanggalKemerdekaan() {
        return tanggalKemerdekaan;
    }

    public int getBulanKemerdekaan() {
        return bulanKemerdekaan;
    }

    public int getTahunKemerdekaan() {
        return tahunKemerdekaan;
    }

    public void tampilkanDetail(HashMap<Integer, String> mapBulan) {
        String sebutanPemimpin = "";

        if (this.jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            sebutanPemimpin = "Raja";
        } else if (this.jenisKepemimpinan.equalsIgnoreCase("presiden")) {
            sebutanPemimpin = "Presiden";
        } else if (this.jenisKepemimpinan.equalsIgnoreCase("perdana menteri")) {
            sebutanPemimpin = "Perdana Menteri";
        } else {
            sebutanPemimpin = this.jenisKepemimpinan;
        }

        System.out.println("Negara " + this.nama + " mempunyai " + sebutanPemimpin + " bernama " + this.namaPemimpin);

        if (!this.jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            String namaBulan = mapBulan.get(this.bulanKemerdekaan);
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + this.tanggalKemerdekaan + " " + namaBulan + " " + this.tahunKemerdekaan);
        }
    }
}