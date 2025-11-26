package Soal1;
import java.util.Scanner;

public class InventoryFacade {
    private InventoryRepository repository;
    private CommandFactory factory;
    private Scanner scanner;
    private boolean isRunning;

    public InventoryFacade() {
        this.repository = new InventoryRepository();
        this.factory = new CommandFactory(repository);
        this.scanner = new Scanner(System.in);
        this.isRunning = true;
    }

    public void start() {
        while (isRunning) {
            showMenu();
            String input = scanner.nextLine();

            System.out.println();

            if (input.equals("0")) {
                isRunning = false;
            } else {
                Command command = factory.createCommand(input);
                if (command != null) {
                    command.execute(scanner);
                } else {
                    System.out.println("Pilihan tidak valid!");
                }
            }
        }
        scanner.close();
    }

    private void showMenu() {
        System.out.println("\n===== INVENTARIS TOKO =====");
        System.out.println("1. Tambah Barang");
        System.out.println("2. Hapus Barang");
        System.out.println("3. Lihat Semua Barang");
        System.out.println("0. Keluar");
        System.out.println("===========================");
        System.out.print("Pilih Menu: ");
    }
}