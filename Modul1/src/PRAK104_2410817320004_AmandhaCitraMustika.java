import java.util.Scanner;

public class PRAK104_2410817320004_AmandhaCitraMustika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String[] Abu = input.nextLine().split(" ");
        System.out.print("Tangan Bagas: ");
        String[] Bagas = input.nextLine().split(" ");

        int skorAbu = 0;
        int skorBagas = 0;
        for (int Ronde = 0; Ronde < 3; Ronde++) {
            if(Abu[Ronde].charAt(0) == 'B' && Bagas[Ronde].charAt(0) == 'G' ||
                    Abu[Ronde].charAt(0) == 'G' && Bagas[Ronde].charAt(0) == 'K' ||
                    Abu[Ronde].charAt(0) == 'K' && Bagas[Ronde].charAt(0) == 'B') {
                skorAbu++; }
            else if(Bagas[Ronde].charAt(0) == 'B' && Abu[Ronde].charAt(0) == 'G' ||
                    Bagas[Ronde].charAt(0) == 'G' && Abu[Ronde].charAt(0) == 'K' ||
                    Bagas[Ronde].charAt(0) == 'K' && Abu[Ronde].charAt(0) == 'B') {
                skorBagas++; } }
        if(skorAbu > skorBagas) {
            System.out.print("Abu"); }
        else if(skorBagas > skorAbu) {
            System.out.print("Bagas"); }
        else {
            System.out.print("Seri"); }
    }
}