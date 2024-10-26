
    public class office {
    private static int officeCounter = 100; // Static counter for office room numbers
    private int roomNumber;
    private Employee[] employees; // Fixed-size array of employees (max 2)
    private int employeeCount;

    public office() {
        this.roomNumber = officeCounter++;
        this.employees = new Employee[2]; // Max 2 employees per office
        this.employeeCount = 0;
    }

    // Method to add an employee to the office (max 2 employees per office)
    public boolean addEmployee(Employee employee) {
        if (employeeCount < 2) {
            employees[employeeCount++] = employee;
            return true;
        }
        return false; // Office is full
    }

    

    public static int getOfficeCounter() {
        return officeCounter;
    }

    public static void setOfficeCounter(int officeCounter) {
        office.officeCounter = officeCounter;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        String details = "Office Room Number: " + roomNumber + "\n";
        if (employeeCount == 0) {
            details += "No employees assigned yet.\n";
        } else {
            for (int i = 0; i < employeeCount; i++) {
                details += employees[i].toString() + "\n";
            }
        }
        return details;
    }
}
