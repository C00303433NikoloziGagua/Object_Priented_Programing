package lab2_4;
public class HotelDriver {
    public static void main(String[] args) {
        // Create a hotel room
        HotelRoom roomA = new HotelRoom(101, "single", 0, 150.00);
        HotelRoom roomB = new HotelRoom(102, "double", 1, 200.00); // Already occupied

        // Test roomA (vacant initially)
        System.out.println("Is roomA occupied? " + roomA.isOccupied()); //false
        roomA.setOccupied(); // Now occupy roomA
        System.out.println("Is roomA occupied? " + roomA.isOccupied()); //true

        // Test roomB (already occupied)
        System.out.println("Is roomB occupied? " + roomB.isOccupied()); //true
        roomB.setOccupied();// "ROom B is already occupied"
    }
}

