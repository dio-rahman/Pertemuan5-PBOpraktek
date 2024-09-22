package akademik;

public class MataKuliah {
    private String kodeMK;
    private String namaMK;
    private int SKS;

    public MataKuliah(String kodeMK, String namaMK, int SKS) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.SKS = SKS;
    }

    public String getKodeMK() { return kodeMK; }
    public void setKodeMK(String kodeMK) { this.kodeMK = kodeMK; }
    public String getNamaMK() { return namaMK; }
    public void setNamaMK(String namaMK) { this.namaMK = namaMK; }
    public int getSKS() { return SKS; }
    public void setSKS(int SKS) { this.SKS = SKS; }

    public void tampilkanInfoMK() {
        System.out.println("Kode: " + kodeMK + ", Nama: " + namaMK + ", SKS: " + SKS);
    }
}