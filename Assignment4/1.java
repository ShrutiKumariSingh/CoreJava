public class Main {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter(5); 

        Passenger p1 = new Passenger(counter, "Alice", 2);
        Passenger p2 = new Passenger(counter, "Bob", 1);
        Passenger p3 = new Passenger(counter, "Charlie", 2);
        Passenger p4 = new Passenger(counter, "David", 2); 

       
        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}
public class TicketCounter {
    private int availableSeats;

    public TicketCounter(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized boolean bookTicket(String passengerName, int numberOfSeats) {
        System.out.println(passengerName + " is trying to book " + numberOfSeats + " seat(s).");

        if (numberOfSeats <= availableSeats) {
            System.out.println("Booking successful for " + passengerName + " (" + numberOfSeats + " seat(s)).");
            availableSeats -= numberOfSeats;
            System.out.println("Seats remaining: " + availableSeats);
            return true;
        } else {
            System.out.println("Booking failed for " + passengerName + ". Not enough seats available.");
            System.out.println("Seats remaining: " + availableSeats);
            return false;
        }
    }
}
public class Passenger extends Thread {
    private TicketCounter ticketCounter;
    private String passengerName;
    private int seatsRequired;

    public Passenger(TicketCounter counter, String name, int seatsRequired) {
        this.ticketCounter = counter;
        this.passengerName = name;
        this.seatsRequired = seatsRequired;
    }

    @Override
    public void run() {
        ticketCounter.bookTicket(passengerName, seatsRequired);
    }
}
