public class Item {
    private String name;
    private String code;

    public Item(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name; }
    public String getCode() {
        return code; }

    @Override
    public String toString() {
        return "Kode: " + code + " | Nama: " + name;
    }
}