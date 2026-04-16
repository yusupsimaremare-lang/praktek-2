public class Main {
    public static void main(String[] args) {

        // Membuat objek Goblin
        Goblin goblin = new Goblin("Goblin Kecil", 100);

        // Membuat objek Dragon
       Dragon dragon = new Dragon("Naga Api", 300, 50);

        // Memanggil method monsterSound
        goblin.monsterSound();
        dragon.monsterSound();
    }
}