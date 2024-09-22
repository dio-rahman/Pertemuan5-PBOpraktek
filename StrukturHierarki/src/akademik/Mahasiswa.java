package akademik;

public class Mahasiswa extends Person {
    private String NIM;
    private String jurusan;
    private int angkatan;

    public Mahasiswa(String nama, String alamat, int usia, String NIM, String jurusan, int angkatan) {
        super(nama, alamat, usia);
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
    }

    public String getNIM() { return NIM; }
    public void setNIM(String NIM) { this.NIM = NIM; }
    public String getJurusan() { return jurusan; }
    public void setJurusan(String jurusan) { this.jurusan = jurusan; }
    public int getAngkatan() { return angkatan; }
    public void setAngkatan(int angkatan) { this.angkatan = angkatan; }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("NIM: " + NIM + ", Jurusan: " + jurusan + ", Angkatan: " + angkatan);
    }
}