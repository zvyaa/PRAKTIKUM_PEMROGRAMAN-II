package Soal1;
import java.util.Scanner;

public class RemoveCommand implements Command {
    private InventoryRepository repository;

    public RemoveCommand(InventoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(Scanner scanner) {
        System.out.print("Masukkan Kode Barang yang ingin dihapus: ");
        String code = scanner.nextLine();

        if (repository.remove(code)) {
            System.out.println("Barang berhasil dihapus.");
        } else {
            System.out.println("Barang tidak ditemukan!");
        }
    }
}