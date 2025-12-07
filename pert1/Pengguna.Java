class Pengguna {
    // Tuliskan state (variabel) yang diperlukan di sini
    // Jangan lupa tambahkan konstanta faktorAktivitas
    private int Umur;
    private double Berat_badan;
    private double Tinggi_badan;
    final double faktorAktivitas = 1.2;

    Pengguna(int Umur, double Berat_badan, double Tinggi_badan) {
        this.Umur = Umur;
        this.Berat_badan = Berat_badan;
        this.Tinggi_badan = Tinggi_badan;
    }

    double hitungBMI() {
        // Lengkapi method ini
        double Tinggi_meter = this.Tinggi_badan/100;
        return this.Berat_badan / (Tinggi_meter * Tinggi_meter);
    }

    void tampilKategori() {
        // Lengkapi method ini
        System.out.print("Kategori: ");
        if (this.hitungBMI() < 18.5){
            System.out.println("Kurus");
        } else if (this.hitungBMI() < 25){
            System.out.printf("Normal");
        } else {
            System.out.printf("Obesitas");
        }
    }

    double hitungKalori() {
        // Lengkapi method ini
        return this.Berat_badan * this.faktorAktivitas * 10;
    }

    void tampilInfo() {
        // Lengkapi method ini
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + this.Umur + " tahun");
        System.out.println("Berat: " + this.Berat_badan + " kg");
        System.out.println("Tinggi: " + this.Tinggi_badan + " cm");
        System.out.println("BMI: " + this.hitungBMI());
        System.out.println("Kebutuhan Kalori: " + this.hitungKalori() + " kal/hari");
        System.out.println("====================================");
    }
}