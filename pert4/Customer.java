class Customer {
    // TODO: Buatkan atribut
    protected String Nama_lengkap;
    protected String Nomor_Identitas_Customer;
    protected int Total_Belanja_yang_pernah_dilakukan;

    // TODO: Sediakan constructor
    Customer(String Nama_lengkap, String Nomor_Identitas_Customer, int Total_Belanja_yang_pernah_dilakukan) {
        this.Nama_lengkap = Nama_lengkap;
        this.Nomor_Identitas_Customer = Nomor_Identitas_Customer;
        this.Total_Belanja_yang_pernah_dilakukan = Total_Belanja_yang_pernah_dilakukan;
    }

    void tampilkanInfo() {
        // TODO: tampilkan data customer
        System.out.println("Nama: " + this.Nama_lengkap + " | ID: " + this.Nomor_Identitas_Customer + " | Total Belanja: Rp " + this.Total_Belanja_yang_pernah_dilakukan);
    }
}
