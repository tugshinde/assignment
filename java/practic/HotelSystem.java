import java.util.*;

// Custom Exceptions
class RoomNotAvailableException extends Exception {
    public RoomNotAvailableException(String msg) {
        super(msg);
    }
}

class InvalidBookingException extends Exception {
    public InvalidBookingException(String msg) {
        super(msg);
    }
}

// Base Class
class Room {
    int roomId;
    String roomType;
    double price;
    boolean isAvailable;

    // Constructor Chaining
    Room() {
        this(0, "Unknown", 0.0, true);
    }

    Room(int roomId, String roomType, double price, boolean isAvailable) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Polymorphism
    void bookRoom() throws RoomNotAvailableException {
        if (!isAvailable)
            throw new RoomNotAvailableException("Room not available!");
        isAvailable = false;
        System.out.println("Room " + roomId + " booked.");
    }
}

// Child Class
class LuxuryRoom extends Room {
    String amenities;

    LuxuryRoom(int id, double price, String amenities) {
        super(id, "Luxury", price, true);
        this.amenities = amenities;
    }

    @Override
    void bookRoom() throws RoomNotAvailableException {
        super.bookRoom();
        System.out.println("Luxury amenities: " + amenities);
    }
}

// Child Class
class EconomyRoom extends Room {
    EconomyRoom(int id, double price) {
        super(id, "Economy", price, true);
    }
}

// Customer Class
class Customer {
    int customerId;
    String name;
    String email;

    Customer(int id, String name, String email) {
        this.customerId = id;
        this.name = name;
        this.email = email;
    }
}

public class HotelSystem {
    public static void main(String[] args) {

        List<Room> rooms = new ArrayList<>();
        Map<Customer, Room> bookings = new HashMap<>();

        // Adding rooms
        rooms.add(new LuxuryRoom(1, 5000, "Pool, Spa"));
        rooms.add(new EconomyRoom(2, 2000));

        Customer c1 = new Customer(101, "Tushar", "t@mail.com");

        try {
            Room r = rooms.get(0);
            r.bookRoom();
            bookings.put(c1, r);

        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Bookings: " + bookings.size());
    }
}