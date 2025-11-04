package soal2;
import java.util.LinkedList;
import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<Country> listCountry = new LinkedList<>();

        int number = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < number; i++) {
            String name = scan.nextLine();
            String typeLeadership = scan.nextLine();
            String nameOfLeader = scan.nextLine();

            if (typeLeadership.equals("monarki")) {
                listCountry.add(new Country(name, typeLeadership, nameOfLeader));
            }
            else {
                int dateOfIndependence = scan.nextInt();
                int monthOfIndependence = scan.nextInt();
                int yearOfIndependence = scan.nextInt();
                scan.nextLine();
                listCountry.add(new Country(name, typeLeadership, nameOfLeader, dateOfIndependence, monthOfIndependence, yearOfIndependence));
            }
        }
        for  (Country country : listCountry) {
            country.Display();
        }
        scan.close();
    }
}