import java.util.Scanner;

// Bus class
class Bus {
    private String busNumber;
    private String route;
    private int totalSeats;
    private int bookedSeats;

    public Bus(String busNumber, String route, int totalSeats) {
        this.busNumber = busNumber;
        this.route = route;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    public boolean bookTicket(int seats) {
        if (bookedSeats + seats <= totalSeats) {
            bookedSeats += seats;
            System.out.println(seats + " seat(s) booked successfully on bus " + busNumber);
            return true;
        } else {
            System.out.println("Booking failed! Not enough available seats on bus " + busNumber);
            return false;
        }
    }

    public boolean cancelTicket(int seats) {
        if (bookedSeats >= seats) {
            bookedSeats -= seats;
            System.out.println(seats + " seat(s) cancelled successfully on bus " + busNumber);
            return true;
        } else {
            System.out.println("Cancellation failed! You cannot cancel more seats than booked.");
            return false;
        }
    }

    public void displayBusInfo() {
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Route: " + route);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Booked Seats: " + bookedSeats);
        System.out.println("Available Seats: " + (totalSeats - bookedSeats));
    }
}

// Passenger class
class Passenger {
    private int passengerId;
    private String name;

    public Passenger(int passengerId, String name) {
        this.passengerId = passengerId;
        this.name = name;
    }

    public void bookBus(Bus bus, int seats) {
        if (bus.bookTicket(seats)) {
            System.out.println("Passenger " + name + " successfully booked " + seats + " seat(s).");
        }
    }

    public void cancelBooking(Bus bus, int seats) {
        if (bus.cancelTicket(seats)) {
            System.out.println("Passenger " + name + " successfully cancelled " + seats + " seat(s).");
        }
    }
}

// Main class to test the system
public class BusTicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a bus object
        Bus bus1 = new Bus("B123", "City A - City B", 40);

        // Display bus info
        bus1.displayBusInfo();

        // Creating passenger
        Passenger passenger1 = new Passenger(101, "John Doe");

        // Booking tickets
        System.out.print("Enter number of seats to book: ");
        int seatsToBook = scanner.nextInt();
        passenger1.bookBus(bus1, seatsToBook);

        // Display updated bus info
        bus1.displayBusInfo();

        // Canceling tickets
        System.out.print("Enter number of seats to cancel: ");
        int seatsToCancel = scanner.nextInt();
        passenger1.cancelBooking(bus1, seatsToCancel);

        // Display updated bus info
        bus1.displayBusInfo();

        scanner.close();
    }
}