package PRAK201_2510817110008_NOUFALRADITYAWARDANA;

public class Buah {
    public String nama;
    public double berat;
    public double harga;
    public double jumlah_beli;

    public Buah(String nama, double berat, double harga, double jumlah_beli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlah_beli = jumlah_beli;
    }

    public void info() {
        double hargaSebelumDiskon = (jumlah_beli / berat) * harga;

        double jumlahBlok4Kg = Math.floor(jumlah_beli / 4);
        double harga4Kg = (harga / berat) * 4;
        double totalDiskon = jumlahBlok4Kg * harga4Kg * 0.02;

        double hargaSetelahDiskon = hargaSebelumDiskon - totalDiskon;

        System.out.printf("Nama Buah: %s\n", this.nama);
        System.out.printf("Berat: %s\n", this.berat);
        System.out.printf("Harga: %.1f\n", this.harga);
        System.out.printf("Jumlah Beli: %.1fkg\n", this.jumlah_beli);
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", hargaSebelumDiskon);
        System.out.printf("Total Diskon: Rp%.2f\n", totalDiskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", hargaSetelahDiskon);
    }
}