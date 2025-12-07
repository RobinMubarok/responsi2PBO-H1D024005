abstract class KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT/STATE (semua private)
    // ==========================================================

    private String namaKendaraan;
    private int levelEnergi;
    private int kapasitasPenumpang;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    // levelEnergi default = 100.
    KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang){
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.namaKendaraan = namaKendaraan;
        this.levelEnergi = 100;
    }



    // ==========================================================
    // GETTER
    // ==========================================================

    // TODO: Getter namaKendaraan
    String getNamaKendaraan() {
        return this.namaKendaraan;
    }
    // TODO: Getter levelEnergi
    int getLevelEnergi() {
        return this.levelEnergi;
    }
    // TODO: Getter kapasitasPenumpang
    int getKapasitasPenumpang() {
        return this.kapasitasPenumpang;
    }

    void setLevelEnergi(int levelEnergi){
        this.levelEnergi = levelEnergi;
    }


    // ==========================================================
    // METHOD BIASA
    // ==========================================================

    // TODO:
    // Method final tampilStatus()
    // Format:
    // "[namaKendaraan] | Energi: [levelEnergi]% | Kapasitas: [kapasitasPenumpang] awak"
    void tampilStatus(){
        System.out.println(this.namaKendaraan + " | Energi: " + this.levelEnergi + "% | Kapasitas: " + this.kapasitasPenumpang + " awak");
    }

    // ==========================================================
    // ABSTRACT METHOD (WAJIB DIIMPLEMENTASI SUBCLASS)
    // ==========================================================

    // TODO:
    // abstract void aktifkanMesin();
    abstract void aktifkanMesin();

    // TODO:
    // abstract void jelajah(int jarak);
    abstract void jelajah(int jarak);

    // TODO:
    // abstract void isiEnergi(int jumlah);
    abstract void isiEnergi(int jumlah);
}
