class Monster {
    protected String name;
    protected int baseHp;

    // Constructor untuk mengisi data awal monster
    Monster(String name, int baseHp) {
        this.name = name; // menyimpan nama monster
        this.baseHp = baseHp; // menyimpan HP dasar monster
    }

    void monsterSound() {
        System.out.println("Grooaarrr! Monster mendekat!");
    }
}