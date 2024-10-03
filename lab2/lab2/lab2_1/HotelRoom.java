package lab2_1;
public class HotelRoom {
    // Private member variables
    private int roomNumber;
    private String roomType;

    // Constructor with no arguments
    public HotelRoom() {
        this.roomNumber = 0;
        this.roomType = "";
    }

    // Getter for roomNumber
    public int getRoomNumber() {
        return roomNumber;
    }

    // Setter for roomNumber
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    // Getter for roomType
    public String getRoomType() {
        return roomType;
    }

    // Setter for roomType with validation
    public void setRoomType(String roomType) {
        roomType = roomType.toLowerCase(); // Convert input to lowercase for consistency
        if (roomType.equals("single") || roomType.equals("double")) {
            this.roomType = roomType;
        } else {
            throw new IllegalArgumentException("Room type must be either 'single' or 'double'.");
        }
    }

}
