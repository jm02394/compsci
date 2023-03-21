package Television;

public class FourK extends Television {
    private boolean isHDR;

    public FourK() {
        super();
        isHDR = false;
    }

    public FourK(double price, boolean isHDR) {
        super(price);
        this.isHDR = isHDR;
    }

    public boolean getIsHDR() {
        return isHDR;
    }

    public void setIsHDR(boolean isHDR) {
        this.isHDR = isHDR;
    }

    public String toString() {
        return "The price of this tv is " + getPrice() + ", its model is 4k with " + (isHDR ? "HDR" : "no HDR");
    }
}
