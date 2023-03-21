package Television;

public class DLP extends Television {
    private double maxProjectedScreenSize;

    public DLP() {
        super();
        maxProjectedScreenSize = 0;
    }

    public DLP(double price, double maxProjectedScreenSize) {
        super(price);
        this.maxProjectedScreenSize = maxProjectedScreenSize;
    }

    public double getMaxProjectedScreenSize() {
        return maxProjectedScreenSize;
    }

    public void setMaxProjectedScreenSize(double maxProjectedScreenSize) {
        this.maxProjectedScreenSize = maxProjectedScreenSize;
    }

    public String toString() {
        return "The price of this tv is " + getPrice() + ", its model is DLP Projector with a " + maxProjectedScreenSize
                + " inch max screen size";
    }
}
