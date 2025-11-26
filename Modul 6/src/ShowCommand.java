import java.util.List;
import java.util.Scanner;

public class ShowCommand implements Command {
    private InventoryRepository repository;

    public ShowCommand(InventoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(Scanner scanner) {
        List<Item> items = repository.getAll();
        if (items.isEmpty()) {
            System.out.println("Inventaris kosong.");
        } else {
            System.out.println("Daftar Barang:");
            for (Item i : items) {
                System.out.println(i);
            }
        }
    }
}