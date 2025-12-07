class UjiBarang {
    public static void main(String[] args) {
        // Buat objek barang pertama gitar
        BarangMusik Gitar_Akustik = new BarangMusik("GTR-001", "Gitar Akustik Yamaha");
        
        // Atur harga gitar
        Gitar_Akustik.ubahHarga(1500000.0);
        
        // Tambah stok gitar
        Gitar_Akustik.tambahStok(5);
        
        // Buat objek drum
        BarangMusik Drum_Set = new BarangMusik("DRM-001", "Drum Set Pearl", 8500000.0, 3);
        
        // Tampilkan informasi kedua barang
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        Gitar_Akustik.tampilInfo();
        Drum_Set.tampilInfo();
        
    }
}