public class instrument {
    private String type;
    private double price;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public instrument() {
        type = "null";
        price = 0;
    }
    public instrument(String j, double k) {
        type = j;
        price = k;
    }
    public void print() {
        System.out.println("Type: " +type);
        System.out.println("Price: " +price);
    }
}
