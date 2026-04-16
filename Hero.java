// Mendeklarasikan Superclass bernama Hero
public class Hero {
    
    // Kita gunakan PROTECTED agar atribut ini otomatis diwariskan ke Anak, 
    // tapi tetap tersembunyi/aman dari Class luar selain keturunannya.
    protected String name;
    protected int hp;

    // Ini Constructor Induk (Super Constructor)
    public Hero(String name, int hp) {
        this.name = name; // Mengisi atribut name milik objek ini
        this.hp = hp;     // Mengisi atribut hp milik objek ini
    }

    // Method Base (Method bawaan Induk yang akan diturunkan)
    public void showInfo() {
        System.out.println("Hero Name: " + this.name);
        System.out.println("Health   : " + this.hp);
    }

    // Method Base kedua (akan kita Override nanti di anak)
    public void attack() {
        System.out.println(this.name + " melakukan serangan biasa!");
    }
}