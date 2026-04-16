// === FILE 1: Assassin.java ===
public class Assassin extends Hero {
    
    public Assassin(String name) {
        super(name); // Lapor Bapak
    }

    // Menimpa attack() Versi 1 milik Bapak
    @Override
    public void attack() {
        System.out.println("[ASSASSIN] " + this.name + " menghilang dan menusuk dari belakang! 🗡️");
    }

    // Skill Khusus Assassin (Hanya Assassin yang punya)
    public void hideInBush() {
        System.out.println(this.name + " sedang bersembunyi di rumput...");
    }
}

