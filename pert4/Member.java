class Member extends Customer {
    // TODO: Tambahkan atribut tambahan
    private int Poin_Reward;
    private String Level_Keanggotaan;

    // TODO: Buat constructor dengan super
    Member(String Nama_lengkap, String Nomor_Identitas_Customer, int Total_Belanja_yang_pernah_dilakukan, int Poin_Reward, String Level_Keanggotaan) {
        super(Nama_lengkap, Nomor_Identitas_Customer, Total_Belanja_yang_pernah_dilakukan);
        this.Poin_Reward = Poin_Reward;
        this.Level_Keanggotaan = Level_Keanggotaan;
    }
    @Override
    void tampilkanInfo() {
        // TODO: panggil super, lalu tampilkan data tambahan
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + this.Poin_Reward + " | Level: " + this.Level_Keanggotaan);
    }
}
