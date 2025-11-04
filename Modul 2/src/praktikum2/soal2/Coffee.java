package praktikum2.soal2;

public class Coffee {
    public String Name;
    public String Size;
    public double Price;
    public String Buyer;

    public void info() {
        System.out.println("Nama Kopi: " + this.Name);
        System.out.println("Ukuran: " + this.Size);
        System.out.println("Harga: Rp. " + this.Price);
    }

    public void setBuyer(String buyerName) {
        this.Buyer = buyerName;
    }

    public String getBuyer() {
        return this.Buyer;
    }

    public double getTax() {
        double taxRate = 0.11;
        return this.Price * taxRate;
    }
}
