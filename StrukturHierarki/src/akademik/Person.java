package akademik;

public class Person {
    private String nama;
    private String alamat;
    private int usia;

    public Person(String nama, String alamat, int usia) {
        this.nama = nama;
        this.alamat = alamat;
        this.usia = usia;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
    public int getUsia() { return usia; }
    public void setUsia(int usia) { this.usia = usia; }

    public void tampilkanData() {
        System.out.println("Nama: " + nama + ", Alamat: " + alamat + ", Usia: " + usia);
    }
}