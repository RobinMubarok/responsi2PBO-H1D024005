class KapalEksplorasi extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    // TODO:
    // private int modulScan   // kemampuan scan planet (level 1–5)
    private int modulScan;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    //   - modulScan
    KapalEksplorasi(String namaKendaraan, int levelEnergi, int modulScan){
        super(namaKendaraan, levelEnergi);
        this.modulScan = modulScan;
    }


    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    // @Override aktifkanMesin()
    // Jika energi < 15 → "Energi tidak mencukupi untuk memulai ekspedisi!"
    // Jika cukup → "Kapal eksplorasi siap berangkat!"
    @Override
    void aktifkanMesin(){
        if(this.getLevelEnergi() < 15){
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }


    // @Override jelajah(int jarak)
    // Konsumsi energi: 2% per 1 km (lebih efisien).
    // Jika cukup → kurangi energi & tampilkan jarak perjalanan.
    @Override
    void jelajah(int jarak){
        System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        if(this.getLevelEnergi() - (jarak * 2) > 0){
            this.setLevelEnergi(this.getLevelEnergi() - (jarak * 2));
        } else {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        }
    }


    // @Override isiEnergi(int jumlah)
    // Tambah energi secara bertahap sampai 100%.
    // Tampilkan pesan pengisian.\
    @Override
    void isiEnergi(int jumlah){
        for(int i = 0; i < jumlah; i++){
            this.setLevelEnergi(this.getLevelEnergi() + 1);
            System.out.println("Energi Terisi Menjadi: " + this.getLevelEnergi() + "%");
        }
        System.out.println("Energi Telah Terisi!");
    }


    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    // TODO:
    // void scanPlanet(String namaPlanet)
    // Tampilkan:
    // "Melakukan scan pada planet [namaPlanet] dengan modul level [modulScan]."
    void scanPlanet(String namaPlanet){
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + this.modulScan + ".");
    }
}
