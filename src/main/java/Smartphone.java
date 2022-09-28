public class Smartphone extends Product {
    protected int vendor;

    public Smartphone(int id, String title, int price, int vendor) {
        super(id, title, price);
        this.vendor = vendor;
    }

    public int getVendor() {
        return vendor;
    }

    public void setVendor(int vendor) {
        this.vendor = vendor;
    }
}
