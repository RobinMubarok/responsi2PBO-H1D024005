class PesawatTempur extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    // TODO:
    private int jumlahRudal;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================


    // TODO:
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    //   - jumlahRudal
    // Panggil super(...) untuk parent.
    PesawatTempur(String namaKendaraan, int levelEnergi, int jumlahRudal){
        super(namaKendaraan, levelEnergi);
        this.jumlahRudal = jumlahRudal;
    }

    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    // @Override aktifkanMesin()
    // Jika energi < 20 → tampilkan "Energi terlalu rendah! Mesin tidak dapat diaktifkan."
    // Jika cukup → tampilkan "Mesin pesawat tempur diaktifkan."
    @Override
    void aktifkanMesin(){
        if(this.getLevelEnergi() < 20){
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }


    // @Override jelajah(int jarak)
    // Konsumsi energi: 3% per 1 km.
    // Jika energi tidak cukup → tampilkan pesan gagal.
    // Jika cukup → kurangi energi dan tampilkan:
    // "Pesawat tempur menjelajah sejauh [jarak] km."
    @Override
    void jelajah(int jarak){
        if(this.getLevelEnergi() - (jarak * 3) > 0){
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
            this.setLevelEnergi(this.getLevelEnergi() - (jarak * 3));
        } else {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        }
    }


    // @Override isiEnergi(int jumlah)
    // Tambah energi sampai max 100%.
    // Tampilkan pesan peningkatan energi.
    @Override
    void isiEnergi(int jumlah){
        for(int i = 0; i < jumlah || i < 100; i++){
            this.setLevelEnergi(this.getLevelEnergi() + 1);
            System.out.println("Energi Terisi Menjadi: " + this.getLevelEnergi() + "%");
        }
        System.out.println("Energi Telah Terisi!");
    }


    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    // TODO:
    // void tembakRudal(int jumlah)
    // - Jika jumlahRudal cukup → kurangi dan tampilkan:
    //   "Menembakkan [jumlah] rudal!"
    // - Jika tidak cukup → tampilkan pesan gagal.
    void tembakRudal(int jumlah){
        this.jumlahRudal -= jumlah;
        if(this.jumlahRudal >= 0){
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Rudal Habis!");
        }
    }
}
