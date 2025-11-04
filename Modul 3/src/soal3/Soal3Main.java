package soal3;
import java.util.ArrayList;
import java.util.Scanner;

public class Soal3Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> listStudent = new ArrayList<>();

        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name = scan.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String id = scan.nextLine();
                    listStudent.add(new Student(name, id));
                    System.out.println("Mahasiswa " + listStudent.get(listStudent.size()-1).getName() + " ditambahkan.\n");
                    break;

                case 2 :
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String removeId = scan.nextLine();
                    boolean remove = false;
                    for (int i = 0; i < listStudent.size(); i++) {
                        if (listStudent.get(i).getId().equals(removeId)) {
                            listStudent.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + removeId + " dihapus\n");
                            remove = true;
                            break;
                        }
                    }
                    if (!remove) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan!\n");
                    }
                    break;

                case 3:
                    System.out.print("\nMasukkan NIM Mahasiswa yang ingin dicari: ");
                    String searchId = scan.nextLine();
                    boolean search = false;
                    for (Student student : listStudent) {
                        if (student.getId().equals(searchId)) {
                            System.out.println("Data Mahasiswa yang dicari yaitu:");
                            System.out.println("Nama Mahasiswa: " + student.getName());
                            System.out.println("NIM Mahasiswa: " + student.getId());
                            System.out.println();
                            search = true;
                            break;
                        }
                    }
                    if (!search) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan!\n");
                    }
                    break;

                case 4:
                    if(listStudent.isEmpty()){
                        System.out.println("Belum ada daftar Mahasiswa!");
                    }
                    else {
                        System.out.println("Daftar Mahasiswa:");
                        for (int i = 0; i < listStudent.size(); i++) {
                            Student student = listStudent.get(i);
                            System.out.println("NIM: " + student.getId() + ", Nama: " + student.getName());
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    listStudent.clear();
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silahkan coba lagi!\n");
                    break;
            }
        } while (choice != 0) ;
    }
}