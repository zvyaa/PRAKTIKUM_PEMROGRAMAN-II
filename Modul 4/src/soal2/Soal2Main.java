package soal2;
import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String name = input.nextLine();
        System.out.print("Ras: ");
        String breed = input.nextLine();

        Pet mypet = new Pet(name, breed);
        mypet.setName(name);
        mypet.setBreed(breed);
        mypet.display();
        input.close();
    }
}
