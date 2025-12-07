// Gunakan keyword untuk mewarisi class Karyawan
class Manajer extends Karyawan {
    // Deklarasikan variabel tambahan khusus Manajer (tunjangan)
    private double tunjangan;
    private String manajerInfo;

    // Constructor
    // Tips: Gunakan 'super' untuk memanggil constructor parent
    Manajer(String nama, double gajiPokok,  double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
        this.status = "Manajer";
        this.manajerInfo = "Tunjangan: " + this.tunjangan;
        this.informasi = "Status: " + this.status + "\n" + "Nama: " + this.nama + " | Gaji Pokok: Rp " + this.gajiPokok + " | " + this.manajerInfo;
    }

    // Method Override tampilInfo
    // Tips: Tampilkan info dasar, lalu tambahkan info tunjangan dan total gaji
    @Override
    void tampilInfo() {
        super.tampilInfo();
        System.out.println("Total Pendapatan: Rp " + (this.tunjangan + this.gajiPokok));
    }
}