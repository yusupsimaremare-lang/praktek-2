public class Hero {
    
    // Atribut dasar
    protected String name;

    // Constructor
    public Hero(String name) {
        this.name = name;
    }

    // ===============================================
    // METHOD OVERLOADING: 3 Method, Nama Sama!
    // Rahasianya ada pada parameternya yang berbeda.
    // ===============================================

    // Versi 1: Tanpa Parameter
    public void attack() {
        System.out.println(this.name + " menyerang dengan tangan kosong!");
    }

    // Versi 2: Parameter String (Senjata)
    public void attack(String weapon) {
        System.out.println(this.name + " menebas musuh menggunakan " + weapon + "!");
    }

    // Versi 3: Parameter String & int (Senjata & Bonus Damage)
    public void attack(String weapon, int bonusDamage) {
        System.out.println(this.name + " CRITICAL HIT pakai " + weapon + 
                           "!! Damage bertambah +" + bonusDamage);
    }
}