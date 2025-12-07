class UjiGalaksi {
    public static void main(String[] args) {

        // ==========================================================
        // PEMBUATAN OBJEK
        // ==========================================================

        // TODO:
        // Buat objek PesawatTempur dengan:
        //   nama: "Astra-Fury"
        //   kapasitas: 2
        //   jumlahRudal: 8
        PesawatTempur astra = new PesawatTempur("Astra-Fury", 2, 8);


        // TODO:
        // Buat objek KapalEksplorasi dengan:
        //   nama: "Voyager X"
        //   kapasitas: 10
        //   modulScan: 4
        KapalEksplorasi voyager = new KapalEksplorasi("Voyager X", 10, 4);


        // ==========================================================
        // PENGUJIAN PERILAKU
        // ==========================================================

        // TODO:
        // Aktifkan mesin pesawat
        astra.aktifkanMesin();
        // Pesawat menjelajah 10 km
        astra.jelajah(10);
        // Pesawat menjelajah 30 km
        astra.jelajah(30);
        // Pesawat menembak 3 rudal
        astra.tembakRudal(3);
        // Tampilkan status pesawat
        astra.tampilStatus();


        System.out.println();
        // TODO:
        // Aktifkan mesin kapal eksplorasi
        voyager.aktifkanMesin();
        // Kapal menjelajah 15 km
        voyager.jelajah(15);
        // Kapal melakukan scanPlanet("Kepler-442b")
        voyager.scanPlanet("Kepler-442b");
        // Tampilkan status kapal
        voyager.tampilStatus();

    }
}
