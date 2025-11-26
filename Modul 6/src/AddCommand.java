import java.util.Scanner;

public class AddCommand implements Command {
    private InventoryRepository repository;

    public AddCommand(InventoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(Scanner scanner) {
        System.out.print("Masukkan Nama Barang: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan Kode Barang: ");
        String code = scanner.nextLine();

        if (name.isEmpty() || code.isEmpty()) {
            System.out.println("Input tidak boleh kosong!");
            return;
        }

        if (repository.exists(code)) {
            System.out.println("Kode sudah digunakan!");
        } else {
            repository.add(new Item(name, code));
            System.out.println("Barang berhasil ditambahkan!");
        }
    }
}