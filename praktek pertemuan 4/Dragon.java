public class Dragon extends Monster {
    private int fireDamage;

    // Constructor Dragon untuk inisialisasi identitas naga dan kekuatannya
    public Dragon(String name, int baseHp, int fireDamage) {
        // Memanggil constructor superclass agar atribut name dan baseHp terisi otomatis
        super(name, baseHp); 
        this.fireDamage = fireDamage;
    }

    @Override
    public void monsterSound() {
        System.out.println("ROOAAR! Naga menyemburkan api!");
    }
}