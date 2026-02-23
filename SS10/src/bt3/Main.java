package bt3;

public class Main {
    public static void main(String[] args) {
        Animal duck = new Duck("Vịt ");
        Animal fish = new Fish("Cá ");

        ((Swimmable) duck).swim();
        ((Flyable) duck).fly();

        ((Swimmable) fish).swim();
    }
}

