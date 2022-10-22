class Bicycle {
    String color;
    int yearPurchased;

    public Bicycle(String color, int yearPurchased) {
        this.color = color;
        this.yearPurchased = yearPurchased;
    }

    public Bicycle() {
        this.color = "rainbow";
        this.yearPurchased = 2050;
    }

    public String toString() {
        return "This " + this.color + " bicycle was purchased in the year " + this.yearPurchased;
    }
}

class YourObjectDriver {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        System.out.println(bike1.toString());

        Bicycle bike2 = new Bicycle("black", 2022);
        System.out.println(bike2.toString());
    }
}