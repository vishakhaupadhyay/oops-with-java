import java.util.ArrayList;
import java.util.List;

class TicketBooking {

    List<String> tickets = new ArrayList<>();

    TicketBooking() {
        tickets.add("T1");
        tickets.add("T2");
        tickets.add("T3");
        tickets.add("T4");
        tickets.add("T5");
    }

    public synchronized void bookTicket() {

        if (tickets.isEmpty()) {
            System.out.println("Tickets sold out");
            return;
        }

        System.out.println("Ticket successfully booked with id " + tickets.get(0));
        tickets.remove(0);
    }
}

class BookingCounter implements Runnable {

    TicketBooking tb;

    BookingCounter(TicketBooking tb) {
        this.tb = tb;
    }

    public void run() {
        tb.bookTicket();
    }
}

public class Main {

    public static void main(String[] args) {

        TicketBooking tb = new TicketBooking();

        Thread t1 = new Thread(new BookingCounter(tb));
        Thread t2 = new Thread(new BookingCounter(tb));
        Thread t3 = new Thread(new BookingCounter(tb));
        Thread t4 = new Thread(new BookingCounter(tb));
        Thread t5 = new Thread(new BookingCounter(tb));
        Thread t6 = new Thread(new BookingCounter(tb));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}