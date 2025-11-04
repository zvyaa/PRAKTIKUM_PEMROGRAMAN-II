package soal1;
import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dice rD = new Dice();

        System.out.println();
        int numberOfDice = input.nextInt();

        rD.randomValue(numberOfDice);
        rD.Display();
    }
}
