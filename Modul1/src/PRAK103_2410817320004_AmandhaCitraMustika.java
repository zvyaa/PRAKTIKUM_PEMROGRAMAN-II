import java.util.Scanner;

public class PRAK103_2410817320004_AmandhaCitraMustika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Baris = input.nextInt();
        int AngkaAwal = input.nextInt();
        int Awal = 0;

        do {
            if(AngkaAwal % 2 != 0) {
                System.out.print(AngkaAwal);
                Awal ++;
                if(Awal < Baris) {
                    System.out.print(", "); } }
            AngkaAwal++; }
        while (Awal < Baris);

        input.close();
    }
}