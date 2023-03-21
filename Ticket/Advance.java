package Ticket;

class Advance extends Ticket {
    private int daysInAdvance;

    public Advance() {
        super();
    }

    public Advance(int daysInAdvance) {
        super();
        this.daysInAdvance = daysInAdvance;
    }

    public double getPrice() {
        if (daysInAdvance >= 10) {
            return 30;
        }
        return 40;
    }
}
