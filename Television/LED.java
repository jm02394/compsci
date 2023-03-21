package Television;

public class LED extends Television {
    private int responseTime;

    public LED() {
        super();
        responseTime = 0;
    }

    public LED(double price, int responseTime) {
        super(price);
        this.responseTime = responseTime;
    }

    public int getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(int responseTime) {
        this.responseTime = responseTime;
    }

    public String toString() {
        return "The price of this tv is " + getPrice() + ", its model is LED with " + responseTime + "ms response time";
    }
}