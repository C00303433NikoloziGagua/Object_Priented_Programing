package lab2_3;
public class HotelDriver {
    public static void main(String[] args) {
        // Creating a roomC object using the new constructor
        HotelRoom roomC = new HotelRoom(202, "Single", 0, 90.0);

        // Accessing and displaying the values
        System.out.println("Room Number: " + roomC.getRoomNumber());
        System.out.println("Room Type: " + roomC.getRoomType());
        System.out.println("Occupation Status: " + roomC.getOccupationStatus());
        System.out.println("Rate: $" + roomC.getRate());
    }
}
