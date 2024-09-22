package akademik;

import java.util.logging.Logger;

public class Dosen extends Person {
    private String nip;
    private String jabatan;
    private String mataKuliah;
    private static final Logger logger = Logger.getLogger(Dosen.class.getName());
    public Dosen(String nama, String alamat, int usia, String nip, String jabatan, String mataKuliah) {
        super(nama, alamat, usia);
        this.nip = nip;
        this.jabatan = jabatan;
        this.mataKuliah = mataKuliah;
    }

    public String getNip() { return nip; }
    public void setNip(String nip) { this.nip = nip; }
    public String getJabatan() { return jabatan; }
    public void setJabatan(String jabatan) { this.jabatan = jabatan; }
    public String getMataKuliah() { return mataKuliah; }
    public void setMataKuliah(String mataKuliah) { this.mataKuliah = mataKuliah; }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        logger.info(String.format("NIP: %s, Jabatan: %s, Mata Kuliah: %s", nip, jabatan, mataKuliah));
    }
}