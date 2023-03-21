package Ticket;

abstract class Ticket {
    private static int nextSerialNumber = 0;
    private int serialNumber;

    public Ticket() {
        serialNumber = getNextSerialNumber();
    }

    public abstract double getPrice();

    public String toString() {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }

    public static int getNextSerialNumber() {
        return nextSerialNumber++;
    }
}
