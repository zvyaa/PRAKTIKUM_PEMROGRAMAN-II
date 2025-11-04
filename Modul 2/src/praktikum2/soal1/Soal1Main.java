package praktikum2.soal1;

public class Soal1Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apel", 0.4, 7000.0, 40.0);
        apple.display();

        Fruit manggo = new Fruit("mangga", 0.2, 3500.0, 15.0);
        manggo.display();

        Fruit avocado = new Fruit("alpukat", 0.25, 10000.0, 12.0);
        avocado.display();
    }
}