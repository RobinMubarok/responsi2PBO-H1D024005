class Karyawan {
    // Deklarasikan variabel/state dasar (nama, gajiPokok)
    // Gunakan access modifier yang tepat agar bisa diakses oleh subclass (misal: protected)
    protected String nama;
    protected double gajiPokok;
    protected String status = "Karyawan Biasa";
    protected String informasi;
    
    // Constructor untuk inisialisasi nama dan gajiPokok
    Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.informasi = "Status: " + this.status + "\n" + "Nama: " + this.nama + " | Gaji Pokok: Rp " + this.gajiPokok;
    }
    
    // Method untuk menampilkan informasi dasar karyawan
    void tampilInfo() {
        System.out.println(this.informasi);
    }
}