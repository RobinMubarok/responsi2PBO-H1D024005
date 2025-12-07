class BarangMusik {
    // Deklarasikan variabel/state yang diperlukan di sini
    private String Kode_unik_barang;
    private String Nama_alat_musik;
    private double Harga_satuan;
    private int Jumlah_stok;

    // Constructor
    BarangMusik(String Kode_unik_barang, String Nama_alat_musik){
        this.Kode_unik_barang = Kode_unik_barang;
        this.Nama_alat_musik = Nama_alat_musik;
        this.Harga_satuan = 0.0;
        this.Jumlah_stok = 0;
    }

    BarangMusik(String Kode_unik_barang, String Nama_alat_musik, double Harga_satuan){
        this.Kode_unik_barang = Kode_unik_barang;
        this.Nama_alat_musik = Nama_alat_musik;
        this.Harga_satuan = Harga_satuan;
        this.Jumlah_stok = 0;
    }

    BarangMusik(String Kode_unik_barang, String Nama_alat_musik, double Harga_satuan, int Jumlah_stok){
        this.Kode_unik_barang = Kode_unik_barang;
        this.Nama_alat_musik = Nama_alat_musik;
        this.Harga_satuan = Harga_satuan;
        this.Jumlah_stok = Jumlah_stok;
    }
    
    void ubahHarga(double hargaBaru) {
        this.Harga_satuan = hargaBaru;
    }
    
    void tambahStok(int jumlah) {
        this.Jumlah_stok += jumlah;
    }

    void tampilInfo() {
        System.out.println("Alat musik " + this.Nama_alat_musik + " | Kode: " + this.Kode_unik_barang + " | Harga: Rp " + this.Harga_satuan + " | Stok: " + this.Jumlah_stok + " unit");
    }
}