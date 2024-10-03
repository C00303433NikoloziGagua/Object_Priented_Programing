package lab2_3;
public class HotelRoom {
    // Private member variables
    private int roomNumber;
    private String roomType;
    private int occupationStatus;
    private double rate;


    // Second constructor with arguments and validation
    //i dont know if falidation is essential but i am still doing it as much as i can
    public HotelRoom(int roomNumber, String roomType, int occupationStatus, double rate) 
    {
        this.roomNumber = roomNumber;
        
        // Add validation for roomType
        roomType = roomType.toLowerCase();
        if (roomType.equals("single") || roomType.equals("double")) {
            this.roomType = roomType;
        } else {
            throw new IllegalArgumentException("Room type must be either 'single' or 'double'.");
        }
    
        // Add validation for occupationStatus
        if (occupationStatus == 0 || occupationStatus == 1) {
            this.occupationStatus = occupationStatus;
        } else {
            throw new IllegalArgumentException("OccupationStatus must either be 0 or 1");
        }
        
        this.rate = rate;
    }

    // Constructor with no arguments
    public HotelRoom()
    {
        this.roomNumber = 0;
        this.roomType = "";
        this.occupationStatus = 0;
        this.rate = 0;
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

    // Getter method for occupationStatus
    public int getOccupationStatus() {
        return occupationStatus;
    }

    // Setter method for occupationStatus with validation
    public void setOccupationStatus(int occupationStatus) {
        if (occupationStatus == 0 || occupationStatus == 1) {
            this.occupationStatus = occupationStatus;
        } else {
            throw new IllegalArgumentException("OccupationStatus must either be 0 or 1");
        }
    }

    // Setter method for rate
    public void setRate(double rate) {
        this.rate = rate;
    }

    // Getter method for rate
    public double getRate() {
        return rate;
    }

}

