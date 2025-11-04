import java.util.Scanner;

public class PRAK101_2410817320004_AmandhaCitraMustika {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String Nama = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String TempatLahir = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        String TanggalLahir = input.nextLine();
        System.out.print("Masukkan Bulan Lahir: ");
        String BulanLahir = input.nextLine();
        System.out.print("Masukkan Tahun Lahir: ");
        String TahunLahir = input.nextLine();
        System.out.print("Masukkan Tinggi Badan: ");
        String TinggiBadan = input.nextLine();
        System.out.print("Masukkan Berat Badan: ");
        String BeratBadan = input.nextLine();

        switch (BulanLahir) {
            case "1" -> BulanLahir = "Januari";
            case "2" -> BulanLahir = "Februari";
            case "3" -> BulanLahir = "Maret";
            case "4" -> BulanLahir = "April";
            case "5" -> BulanLahir = "Mei";
            case "6" -> BulanLahir = "Juni";
            case "7" -> BulanLahir = "Juli";
            case "8" -> BulanLahir = "Agustus";
            case "9" -> BulanLahir = "September";
            case "10" -> BulanLahir = "Oktober";
            case "11" -> BulanLahir = "November";
            case "12" -> BulanLahir = "Desember"; }

        System.out.println("Nama lengkap " + Nama + ", Lahir di " + TempatLahir + " pada Tanggal " + TanggalLahir + " " + BulanLahir + " " + TahunLahir);
        System.out.print( "Tinggi Badan " + TinggiBadan + " cm dan Berat Badan " + BeratBadan + " kilogram");

        input.close();
    }
}