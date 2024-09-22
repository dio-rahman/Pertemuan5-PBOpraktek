package main;

import akademik.*;
import java.util.logging.Logger;

public class Main {
    private static final String ANSI_BOLD = "\u001B[1m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Mahasiswa[] mahasiswa = {
            new Mahasiswa("Dio", "Bandung", 19, "231511073", "Teknik Komputer dan Informatika", 2023),
            // Tambahkan data lainnya...
        };

        Dosen[] dosen = {
            new Dosen("Pak Yadhi", "Bandung", 40, "D001", "Profesor", "Pemrograman Java"),
            // Tambahkan data lainnya...
        };

        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Java", 3);
        Jadwal[] jadwal = {
            new Jadwal("Senin", "Ruang A", dosen[0], mk1),
            // Tambahkan jadwal lainnya...
        };

        // Tampilkan data
        logger.info(String.format(ANSI_BOLD + "Data Mahasiswa:" + ANSI_RESET));
        for (Mahasiswa m : mahasiswa) {
            m.tampilkanData();
        }

        logger.info(String.format(ANSI_BOLD + "Jadwal Perkuliahan:" + ANSI_RESET));
        for (Jadwal j : jadwal) {
            j.tampilkanJadwal();
        }
    }
}