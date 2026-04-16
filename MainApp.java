// Ini adalah tempat eksekusi program
public class MainApp {
    public static void main(String[] args) {
        
        System.out.println("--- BATTLE ARENA ---");

        // 1. Mencetak objek Warrior
        // Param: (name, hp, armor)
        Warrior arthur = new Warrior("King Arthur", 2000, 50);
        
        // 2. Mencetak objek Mage
        // Param: (name, hp, magicPower)
        Mage merlin = new Mage("Merlin The Wise", 800, 150);

        // --- PEMBUKTIAN INHERITANCE ---
        // Ingat! Kita tidak pernah mengetik method showInfo() di file Warrior/Mage.
        // Tapi kita BISA memanggilnya karena mereka Mewarisi itu dari Hero!
        arthur.showInfo();
        merlin.showInfo();

        System.out.println("\n--- ATTACK PHASE ---");

        // Arthur tidak melakukan override attack(), maka dia pakai versi Bapaknya
        arthur.attack(); 
        
        // Merlin telah melakukan Override attack(), maka versi dialah yang jalan!
        merlin.attack(); 
        
        // Memanggil method khusus subclass
        arthur.useShield();
    }
}