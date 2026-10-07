package PRAK203_2510817110008_NOUFALRADITYAWARDANA;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        // Error tidak ada titik koma diperbaiki
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assassin");

        // Error tidak menampung tipe integer diperbaiki
        p1.umur = 17;

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);

        // Error kurang "tahun" pada print umur
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}