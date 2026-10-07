package PRAK202_2510817110008_NOUFALRADITYAWARDANA;

public class Kopi {
    public String namaKopi;
    public String ukuran;
    public double harga;
    private String pembeli;

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public String getPembeli() {
        return this.pembeli;
    }

    public double getPajak() {
        return this.harga * 0.11;
    }

    public void info() {
        System.out.printf("Nama Kopi: %s\n", this.namaKopi);
        System.out.printf("Ukuran: %s\n", this.ukuran);
        System.out.printf("Harga: Rp. %.1f\n", this.harga);
    }
}