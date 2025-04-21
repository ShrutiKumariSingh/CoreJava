public class Main {
    public static void main(String[] args) {
        Runway runway = new Runway();

        Flight f1 = new Flight(runway, "Flight-A101", "landing");
        Flight f2 = new Flight(runway, "Flight-B202", "takeoff");
        Flight f3 = new Flight(runway, "Flight-C303", "landing");
        Flight f4 = new Flight(runway, "Flight-D404", "takeoff");

        f1.start();
        f2.start();
        f3.start();
        f4.start();
    }
}
public class Runway {
    public synchronized void useRunway(String flightName, String operation) {
        System.out.println(flightName + " is requesting to " + operation + ".");

        try {
            System.out.println(flightName + " is " + operation + " on the runway...");
            Thread.sleep(2000); 
            System.out.println(flightName + " has completed " + operation + ".");
        } catch (InterruptedException e) {
            System.out.println("Operation interrupted for " + flightName);
        }
    }
}
public class Flight extends Thread {
    private Runway runway;
    private String flightName;
    private String operation; 

    public Flight(Runway runway, String flightName, String operation) {
        this.runway = runway;
        this.flightName = flightName;
        this.operation = operation;
    }
    public void run() 
    {
        runway.useRunway(flightName, operation);
    }
}
