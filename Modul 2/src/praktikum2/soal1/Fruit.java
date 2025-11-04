package praktikum2.soal1;

public class Fruit {
    String Name;
    double Weight;
    double Price;
    double PurchaseAmount;
    final double PercentDiscount= 0.02;
    final double WeightDiscount= 4.0;

    public Fruit(String Name, double Weight, double Price, double PurchaseAmount) {
        this.Name = Name;
        this.Weight = Weight;
        this.Price = Price;
        this.PurchaseAmount = PurchaseAmount;
    }

    public String getName() {
        return Name;
    }

    public double getWeight() {
        return Weight;
    }

    public double getPrice() {
        return Price;
    }

    public double getPurchaseAmount() {
        return PurchaseAmount;
    }

    public double getPriceBeforeDiscount(){
        return (Price/Weight) * PurchaseAmount;
    }
    public double getTotalDiscount(){
        double TotalDiscount= (int)(PurchaseAmount / WeightDiscount) * (WeightDiscount * Price) * PercentDiscount;
        return TotalDiscount;
    }
    public double getPriceAfterDiscount(){
        return getPriceBeforeDiscount() - getTotalDiscount();
    }

    public void display(){
        System.out.println("Nama Buah: "+Name);
        System.out.println("Berat: "+Weight);
        System.out.println("Harga: "+Price);
        System.out.println("Jumlah Beli: "+PurchaseAmount+"kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", getPriceBeforeDiscount() );
        System.out.printf("Total Diskon: Rp%.2f%n", getTotalDiscount());
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n%n",  getPriceAfterDiscount());
    }
}

