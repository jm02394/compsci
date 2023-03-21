package Ticket;

class StudentAdvance extends Advance {
    public StudentAdvance() {
        super();
    }

    public StudentAdvance(int daysInAdvance) {
        super(daysInAdvance);
    }

    public double getPrice() {
        return super.getPrice() * 0.5;
    }
}
