package Ticket;

public class TicketDriver {
    public static void main(String[] args) {
        Ticket[] tickets = {
                new Walkup(),
                new Advance(5),
                new Advance(10),
                new StudentAdvance(15),
        };
        for (Ticket t : tickets) {
            System.out.println(t);
        }
    }
}
