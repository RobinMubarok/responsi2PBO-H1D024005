class analisisMesin {
    public static void main(String[] args) {

        // Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] mesin = new defaultMesin[5];
        // Isi array dengan objek mesinMotor
        mesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        // Isi array dengan objek mesinTraktor
        mesin[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        // Isi array dengan objek mesinTraktorListrik
        mesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300,  4.2, 70.0);
        mesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        mesin[4] = new mesinTraktorListrik("Volta FarmX", 200,  3.5, 80.0);
        System.out.println("=== DATA MESIN MEGATECH ===");

        // Loop untuk menampilkan info masing-masing mesin
        for(int i = 0; i < mesin.length; i++){
            mesin[i].tampilInfo();
            System.out.println("Kategori: " + mesin[i].kategoriMesin());
            System.out.println("Performa: " + mesin[i].nilaiPerforma());
            System.out.println();
        }
        // Loop untuk menampilkan kategori dan performa



        System.out.println("=== SUARA MESIN ===");

        // Loop untuk menghasilkan suara tiap mesin (instanceof)
        for(int j = 0; j < mesin.length; j++){
            if(mesin[j] instanceof mesinMotor){
                mesinMotor motor = (mesinMotor) mesin[j];
                System.out.print(motor.namaMesin + " -> ");
                motor.suaraMesin();
            } else if(mesin[j] instanceof mesinTraktor){
                mesinTraktor traktor = (mesinTraktor) mesin[j];
                System.out.print(traktor.namaMesin + " -> ");
                traktor.suaraMesin();
            } else if(mesin[j] instanceof mesinTraktorListrik){
                mesinTraktorListrik traktor = (mesinTraktorListrik) mesin[j];
                System.out.print(traktor.namaMesin + " -> ");
                traktor.suaraMesin();
            } else {
                System.out.println(mesin[j].namaMesin + " -> Prepettt...");
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        // Logika menemukan mesin dengan performa tertinggi
        for(int i = mesin.length-1; i >= 1 ; i--){
            for(int j = 0; j < i; j++){
                if(mesin[j].nilaiPerforma() < mesin[j+1].nilaiPerforma()){
                    defaultMesin mesinTemp = mesin[j];
                    mesin[j] = mesin[j+1];
                    mesin[j+1] = mesinTemp;
                }
            }
        }

        System.out.println(mesin[0].namaMesin + ": " +  mesin[0].nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        // Logika sorting 3 performa tertinggi
        for(int i = 0; i < 3; i++){
            System.out.println(mesin[i].namaMesin + ": " +  mesin[i].nilaiPerforma());
        }
    }
}
