package soal3;

public class Cat extends Pet {
    private final String color;

    public Cat(String n, String t, String c) {
        super (n, t);
        this.color = c;
    }

    public void displayCat() {
        super.display();
        System.out.println("Memiliki warna bulu : " +color);
    }
}
