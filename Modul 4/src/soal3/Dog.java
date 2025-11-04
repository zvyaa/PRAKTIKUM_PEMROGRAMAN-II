package soal3;

public class Dog extends Pet {
    private final String color;
    private final String[] abilities;

    public Dog(String n, String t, String c, String[] a) {
        super(n, t);
        this.color = c;
        this.abilities = a;
    }

    public void displayDog() {
        super.display();
        System.out.println("Memiliki warna bulu : " + color);
        System.out.print("Memiliki kemampuan : ");

        for (int i = 0; i < abilities.length; i++) {
            System.out.print(abilities[i]);
            if (i < abilities.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
