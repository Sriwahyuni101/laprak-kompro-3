public class sistemlift {
    public static void main(String[] args) {
        int jumlahOrang = 6; 
        String pesan = (jumlahOrang <= 8) 
        ? "Lift bisa jalan" : "Terlalu penuh, tunggu lift berikutnya";
        System.out.println(pesan);
      
        jumlahOrang = 10; 
        pesan = (jumlahOrang <= 8) 
        ? "Lift bisa jalan" : "Terlalu penuh, tunggu lift berikutnya";
        System.out.println(pesan);
    }
}

