// === FILE 2: Tank.java ===
public class Tank extends Hero {
    
    public Tank(String name) {
        super(name);
    }

    // Menimpa attack() Versi 1 milik Bapak
    @Override
    public void attack() {
        System.out.println("[TANK] " + this.name + " menghantamkan perisai raksasa! 🛡️");
    }

    // Skill Khusus Tank
    public void tauntEnemy() {
        System.out.println(this.name + " memprovokasi semua musuh! (Taunt Active)");
    }
}