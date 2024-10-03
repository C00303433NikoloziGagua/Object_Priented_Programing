package lab2_2;
public class HotelDriver {
    public static void main(String[] args) {
        // Create two room objects
        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();

        // Set room details for roomA
        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");
        roomA.setOccupationStatus(1);
        roomA.setRate(100);

        // Set room details for roomB
        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");
        roomB.setOccupationStatus(0);
        roomB.setRate(80);

        // Print the details of the rooms using getter methods
        System.out.println("Details of Room A:");
        System.out.println("Room Number: " + roomA.getRoomNumber());
        System.out.println("Room Type: " + roomA.getRoomType());
        System.out.println("Occupation Status: " + roomA.getOccupationStatus());
        System.out.println("Rate: " + roomA.getrate());
        System.out.println("Details of Room B:");
        System.out.println("Room Number: " + roomB.getRoomNumber());
        System.out.println("Room Type: " + roomB.getRoomType());
        System.out.println("Occupation Status: " + roomB.getOccupationStatus());
        System.out.println("Rate: " + roomB.getrate());

    }
}
