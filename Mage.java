// Mage adalah ANAK kedua dari Hero
public class Mage extends Hero {
    
    // Atribut khusus Mage
    private int magicPower;

    // Constructor Anak (Mage)
    public Mage(String name, int hp, int magicPower) {
        super(name, hp); // Lapor ke Bapak dulu!
        this.magicPower = magicPower; // Set stat sendiri
    }

    // =====================================
    // METHOD OVERRIDING (MEMBERONTAK DARI BAPAK)
    // =====================================
    // Anotasi @Override memastikan ke compiler bahwa kita menimpa method induk dengan benar.
    @Override
    public void attack() {
        // Logic baru! Bukan "serangan biasa" lagi.
        System.out.println(this.name + " casting Fireball🔥 dengan power " + this.magicPower);
    }
}