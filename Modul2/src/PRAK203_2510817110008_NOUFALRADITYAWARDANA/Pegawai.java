package PRAK203_2510817110008_NOUFALRADITYAWARDANA;

// class Employee diubah jadi Pegawai agar sesuai nama file
public class Pegawai {
    public String nama;
    // tipe data salah seharusnya String untuk kalimat (bukan char)
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // sebelumnya tidak ada parameter string
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}