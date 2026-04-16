public class Goblin extends Monster {
    
    // Ini adalah Constructor untuk membuat objek Goblin
    public Goblin(String name, int baseHp) {
        // super() digunakan untuk mengirimkan data ke constructor milik Monster (induk)
        super(name, baseHp);
    }

    @Override
    public void monsterSound() {
        System.out.println("Kikikik! Goblin mengendap-endap!");
    }
}