public class MainApp {
    public static void main(String[] args) {
        
        // UPCASTING: Menyiapkan Array bertipe Superclass
        Hero[] pasukan = new Hero[3];

        // Memasukkan berbagai class anak ke dalam wadah Bapak (Valid karena IS-A)
        pasukan[0] = new Hero("Arthur");       // Bapak asli
        pasukan[1] = new Assassin("Lancelot"); // Anak 1 nyamar jadi Bapak
        pasukan[2] = new Tank("Gatotkaca");    // Anak 2 nyamar jadi Bapak

        System.out.println("--- PENYERANGAN MASSAL ---");
        
        // Looping pemanggilan perintah yang SAMA (Satu Tombol)
        for (int i = 0; i < pasukan.length; i++) {
            // DYNAMIC METHOD DISPATCH: Java akan mengecek wujud asli di memori.
            // Meskipun wadahnya 'Hero', yang jalan adalah fungsi override anak!
            pasukan[i].attack(); 
        }

        // Bukti OVERLOADING: Memanggil method attack yang butuh 2 parameter
        System.out.println("\n--- OVERLOADING BUKTI ---");
        pasukan[0].attack("Excalibur", 500); 
    }
}