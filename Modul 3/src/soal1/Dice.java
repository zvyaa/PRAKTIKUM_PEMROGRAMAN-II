package soal1;
import java.util.LinkedList;
import java.util.Random;

public class Dice {
    private LinkedList<Integer> numbers;
    private Random random;

    public Dice() {
        this.numbers = new LinkedList<>();
        this.random = new Random(); }

    public void randomValue(int numberOfDice) {
        numbers.clear();
        for (int i = 0; i < numberOfDice; i++) {
            int randomNumber = random.nextInt(6) + 1;
            numbers.add(randomNumber);
        }
    }

    public void Display() {
        int total = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int totalNumber = numbers.get(i);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + numbers.get(i));
            total += totalNumber;
        }
        System.out.println("Total nilai dadu keseluruhan " + total);
    }

}

