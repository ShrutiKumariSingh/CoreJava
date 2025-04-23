import java.io.*;
import java.util.*;
class Passenger
{
	String passengerId,name;
	Passenger(String pId,String n)
	{
		this.passengerId=pId;
		this.name=n;
	}
	static void bookbus(Bus bus,int seats)
	{
		bus.totalseats-=seats;
		bus.bookedSeats=seats;
	}
	static void cancelBooking(Bus bus,int seats)
	{
		bus.totalseats+=seats;
		bus.bookedSeats-=seats;
	}
	public static void main(String a[])
	{
		Bus obj = new Bus(40,0,"Slg to Muz","B123");
		Passenger p= new Passenger("P123","Shruti");
		obj.displayBusInfo();
		bookbus(obj,6);
		obj.displayBusInfo();
		cancelBooking(obj,2);
		obj.displayBusInfo();
	}
}
class Bus
{
	static int totalseats;
	int bookedSeats;
	String BusNumber,route;
	Bus(int TS,int BS,String BN,String R)
	{
		this.totalseats=TS;
		this.bookedSeats=BS;
		this.BusNumber=BN;
		this.route=R;
	}
	 static void bookTicket(int seats)
	{
		totalseats=totalseats-seats;
		System.out.println("Booked:"+seats);
		System.out.println("Total Seats:"+totalseats);
	}
	static void cancelTicket(int seats)
	{
		totalseats=totalseats+seats;
		System.out.println("Booked:"+seats);
		System.out.println("Total Seats:"+totalseats);
	}
		
	void displayBusInfo()
	{
		
		System.out.println("Bus No.:"+BusNumber);
		System.out.println("Route:"+route);
		System.out.println("Total Seats.:"+totalseats);
		System.out.println(" Booked Seats:"+bookedSeats);
	}
}

