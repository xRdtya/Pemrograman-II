package soal2;

public class Anjing extends HewanPeliharaan{
    private String warnaBulu;
    private String kemampuan;

    // Konstruktor Anjing
    public Anjing(String r, String n, String w, String k) {
        super(r, n);
        this.warnaBulu = w;
        this.kemampuan = k;
    }

    // Method displayDetailAnjing yang memanggil super.display() terlebih dahulu
    public void displayDetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + this.warnaBulu);
        System.out.println("Memiliki kemampuan : " + this.kemampuan);
    }
}