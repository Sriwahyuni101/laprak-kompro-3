public class sistemparkir {
     public static void main(String[] args) {
        int jamMasukKendaraan;

        // jika kendaraan masuk jam = 10
        jamMasukKendaraan = 10;
        if (jamMasukKendaraan < 12) {
            System.out.println("Pagi, tarif Rp 5000");
        } else if (jamMasukKendaraan < 18) {
            System.out.println("Siang, tarif Rp 7000");
        } else {
            System.out.println("Malam, tarif Rp 10000");
        }

        // jika kendaraan masuk jam = 20
        jamMasukKendaraan = 20;
        if (jamMasukKendaraan < 12) {
            System.out.println("Pagi, tarif Rp 5000");
        } else if (jamMasukKendaraan < 18) {
            System.out.println("Siang, tarif Rp 7000");
        } else {
            System.out.println("Malam, tarif Rp 10000");
        }
    }

}
