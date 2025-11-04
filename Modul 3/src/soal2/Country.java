package soal2;
import java.util.HashMap;

public class Country {
    private String name, typeLeadership, nameOfLeader;
    private int dateOfIndependence, monthOfIndependence, yearOfIndependence;

    private static final HashMap<Integer, String> Month = new HashMap<>();
    static {
        Month.put(1, "Januari");
        Month.put(2, "Februari");
        Month.put(3, "Maret");
        Month.put(4, "April");
        Month.put(5, "Mei");
        Month.put(6, "Juni");
        Month.put(7, "Juli");
        Month.put(8, "Agustus");
        Month.put(9, "September");
        Month.put(10, "Oktober");
        Month.put(11, "November");
        Month.put(12, "Desember");
    }

    public Country(String name, String typeLeadership, String nameOfLeader, int dateOfIndependence, int monthOfIndependence, int yearOfIndependence) {
        this.name = name;
        this.typeLeadership = typeLeadership;
        this.nameOfLeader = nameOfLeader;
        this.dateOfIndependence = dateOfIndependence;
        this.monthOfIndependence = monthOfIndependence;
        this.yearOfIndependence = yearOfIndependence;
    }
    public Country(String name, String typeLeadership, String nameOfLeader) {
        this.name = name;
        this.typeLeadership = typeLeadership;
        this.nameOfLeader = nameOfLeader;
    }

    public String getName() {
        return name;
    }

    public String getTypeLeadership() {
        return typeLeadership;
    }

    public String getNameOfLeader() {
        return nameOfLeader;
    }

    public int getDateOfIndependence() {
        return dateOfIndependence;
    }

    public int getMonthOfIndependence() {
        return monthOfIndependence;
    }

    public int getYearOfIndependence() {
        return yearOfIndependence;
    }

    public void Display() {
        if (typeLeadership.equals("monarki")) {
            System.out.println("\nNegara " + getName() + " mempunyai Raja bernama " + getNameOfLeader());
        }
        else {
            String month = Month.get(monthOfIndependence);
            System.out.println("\nNegara " + getName() + " mempunyai " + getTypeLeadership() + " bernama " + getNameOfLeader());
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + getDateOfIndependence() + " " + month + " " + getYearOfIndependence());
        }
    }
}