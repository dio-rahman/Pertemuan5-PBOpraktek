package akademik;

public class Jadwal {
    private String hari;
    private String ruangan;
    private Dosen dosen;
    private MataKuliah mataKuliah;

    public Jadwal(String hari, String ruangan, Dosen dosen, MataKuliah mataKuliah) {
        this.hari = hari;
        this.ruangan = ruangan;
        this.dosen = dosen;
        this.mataKuliah = mataKuliah;
    }

    public String getHari() { return hari; }
    public void setHari(String hari) { this.hari = hari; }
    public String getRuangan() { return ruangan; }
    public void setRuangan(String ruangan) { this.ruangan = ruangan; }
    public Dosen getDosen() { return dosen; }
    public void setDosen(Dosen dosen) { this.dosen = dosen; }
    public MataKuliah getMataKuliah() { return mataKuliah; }
    public void setMataKuliah(MataKuliah mataKuliah) { this.mataKuliah = mataKuliah; }

    public void tampilkanJadwal() {
        System.out.println("Hari: " + hari + ", Ruangan: " + ruangan);
        dosen.tampilkanData();
        mataKuliah.tampilkanInfoMK();
    }
}