public class PaymentTest {

    public static void main(String[] args) {

        // TODO:
        // - Buat objek dari EWalletPayment
        EWalletPayment bayar = new EWalletPayment("OVO", 150000.0, 50000.0);
        // - Panggil method yang telah dibuat untuk menguji fungsionalitas
        // - Tampilkan hasil akhir informasi saldo dan detail pembayaran
        //
        // Contoh alur (boleh diikuti atau dimodifikasi oleh praktikan):
        // 1. Menampilkan data sebelum transaksi
        // 2. Memproses pembayaran
        // 3. Menampilkan data setelah transaksi
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===\n" +
                "Saldo awal: " + bayar.getBalance() + "\n" +
                "Memproses pembayaran sebesar " + bayar.nominal_transaksi + "...");
        bayar.processPayment();
        System.out.println("Sisa saldo: " + bayar.getBalance() + "\n" +
                "Detail Transaksi: Pembayaran dilakukan melalui" + bayar.getPaymentDetails());

    }
}
