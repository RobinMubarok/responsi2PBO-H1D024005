public class EWalletPayment implements PaymentMethod {

    // TODO: Buat atribut yang diperlukan, misalnya:
    // - nama penyedia layanan (contoh: Dana, OVO, Gopay)
    // - jumlah saldo
    // - nominal transaksi
    private String nama_penyedia_layanan;
    private double jumlah_saldo;
    double nominal_transaksi;

    // TODO: Buat constructor untuk mengisi nilai atribut
    EWalletPayment(String nama_penyedia_layanan, double jumlah_saldo, double nominal_transaksi) {
        this.nama_penyedia_layanan = nama_penyedia_layanan;
        this.jumlah_saldo = jumlah_saldo;
        this.nominal_transaksi = nominal_transaksi;
    }

    // TODO: Implementasikan semua method yang ada pada interface PaymentMethod

    // Catatan:
    // - Pada method processPayment(), lakukan pengecekan kecukupan saldo
    // - Jika saldo cukup, kurangi saldo lalu tampilkan pesan berhasil
    // - Jika saldo tidak cukup, tampilkan pesan gagal

    @Override
    public void processPayment() {
        if (this.jumlah_saldo - this.nominal_transaksi > 0) {
            this.jumlah_saldo -= this.nominal_transaksi;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Saldo tidak cukup!");
        }
    }

    public String getPaymentDetails() {
        return  this.nama_penyedia_layanan;
    }

    public double getTransactionFee() {
        return this.jumlah_saldo - this.nominal_transaksi;
    }

    public double getBalance() {
        return this.jumlah_saldo;
    }
}
