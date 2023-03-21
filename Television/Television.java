package Television;

public class Television {
    private double price;

    public Television() {
        price = 0;
    }

    public Television(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "The price of this tv is " + price;
    }
}
