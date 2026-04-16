// Menggunakan extends untuk menyatakan bahwa Warrior adalah ANAK dari Hero
public class Warrior extends Hero {
    
    // Atribut khusus ini HANYA dimiliki oleh Warrior, Hero lain nggak punya.
    private int extraArmor;

    // Constructor milik Anak
    public Warrior(String name, int hp, int armor) {
        
        // WAJIB BARIS PERTAMA!
        // super(...) memanggil constructor milik Bapak (Hero)
        // Kita lempar data 'name' dan 'hp' ke Bapak biar Bapak yang ngurus isinya.
        super(name, hp); 
        
        // Setelah kewajiban ke Bapak selesai, baru kita urus data si Anak
        this.extraArmor = armor; 
    }

    // Method tambahan khusus Warrior (Bapaknya nggak punya skill ini)
    public void useShield() {
        System.out.println(this.name + " mengangkat tameng! Armor +" + this.extraArmor);
    }
}