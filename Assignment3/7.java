package travel.flights;

public class Flight {
    // Attributes
    private String flightNumber;
    private String destination;
    private double price;

    // Constructor
    public Flight(String flightNumber, String destination, double price) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.price = price;
    }

    // Method to get flight details
    public String getDetails() {
        return "Flight Number: " + flightNumber + "\nDestination: " + destination + "\nPrice: ₹" + price;
    }
}
package travel.hotels;

public class Hotel {
    // Attributes
    private String hotelName;
    private String location;
    private double price;

    // Constructor
    public Hotel(String hotelName, String location, double price) {
        this.hotelName = hotelName;
        this.location = location;
        this.price = price;
    }

    // Method to get hotel details
    public String getDetails() {
        return "Hotel Name: " + hotelName + "\nLocation: " + location + "\nPrice: ₹" + price;
    }
}
package travel.bookings;

import travel.flights.Flight;
import travel.hotels.Hotel;

public class Booking {
    
    // Method to book a flight
    public void bookFlight(Flight flight) {
        System.out.println("Booking Details for Flight:");
        System.out.println(flight.getDetails());
    }

    // Method to book a hotel
    public void bookHotel(Hotel hotel) {
        System.out.println("\nBooking Details for Hotel:");
        System.out.println(hotel.getDetails());
    }
}
import travel.flights.Flight;
import travel.hotels.Hotel;
import travel.bookings.Booking;

public class TravelBookingSystem {
    public static void main(String[] args) {
        
        // Creating instances of Flight and Hotel
        Flight flight = new Flight("AI202", "Paris", 55000);
        Hotel hotel = new Hotel("Hotel Luxe", "Paris", 10000);
        
        // Creating an instance of Booking class
        Booking booking = new Booking();
        
        // Booking the flight and hotel
        booking.bookFlight(flight);
        booking.bookHotel(hotel);
    }
}
