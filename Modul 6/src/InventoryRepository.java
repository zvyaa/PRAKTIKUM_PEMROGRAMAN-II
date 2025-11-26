import java.util.ArrayList;
import java.util.List;

public class InventoryRepository {
    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public boolean remove(String code) {
        return items.removeIf(item -> item.getCode().equalsIgnoreCase(code));
    }

    public List<Item> getAll() {
        return new ArrayList<>(items);
    }

    public boolean exists(String code) {
        return items.stream().anyMatch(item -> item.getCode().equalsIgnoreCase(code));
    }
}