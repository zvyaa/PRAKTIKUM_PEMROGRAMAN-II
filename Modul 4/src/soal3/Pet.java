package soal3;

public class Pet {
    private final String name;
    private final String breed;

    public Pet(String n, String t) {
        this.name = n;
        this.breed = t;
    }

    public void display() {
        System.out.print("\nDetail Hewan Peliharaan:\n");
        System.out.println("Nama hewan peliharaanku adalah : " + name);
        System.out.println("Dengan ras : " + breed);
    }
}

