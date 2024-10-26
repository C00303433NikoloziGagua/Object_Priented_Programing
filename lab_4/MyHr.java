import java.util.Scanner;

public class MyHr {
    private static final int MAX_EMPLOYEES = 5;
    private static final int MAX_OFFICES = 3;
    
    private Employee[] employees;  // Array to hold up to 5 employees
    private office[] offices;      // Array to hold 3 offices
    private int employeeCount;     // Track the number of employees created

    public MyHr() {
        employees = new Employee[MAX_EMPLOYEES];
        offices = new office[MAX_OFFICES];
        employeeCount = 0;
        initializeOffices();
    }

    // Initialize 3 office records
    private void initializeOffices() {
        for (int i = 0; i < MAX_OFFICES; i++) {
            offices[i] = new office();
        }
    }

    // List all offices
    public void listOffices() {
        for (office office : offices) {
            System.out.println(office);
        }
    }

    // Create a new employee record
    public void createEmployee(String type, String street, String city, String county, String companyCar) {
        if (employeeCount >= MAX_EMPLOYEES) {
            System.out.println("Cannot create more employees. Maximum limit of 5 employees reached.");
            return;
        }

        address empAddress = new address(street, city, county);  // Create address object
        Employee newEmployee;

        if (type.equalsIgnoreCase("Manager")) {
            newEmployee = new Employee(type, empAddress, companyCar);  // Create Manager
        } else {
            newEmployee = new Employee(type, empAddress);  // Create Staff
        }

        // Assign the employee to an available office (max 2 employees per office)
        boolean assigned = false;
        for (office office : offices) {
            if (office.addEmployee(newEmployee)) {
                employees[employeeCount++] = newEmployee;
                System.out.println("Employee added successfully and assigned to office " + office.getOfficeCounter());
                assigned = true;
                break;
            }
        }

        if (!assigned) {
            System.out.println("No office available for the new employee.");
        }
    }

    // List all employees
    public void listEmployees() {
        if (employeeCount == 0) {
            System.out.println("No employees found.");
        } else {
            for (int i = 0; i < employeeCount; i++) {
                System.out.println(employees[i]);
            }
        }
    }

    public static void main(String[] args) {
        MyHr hrSystem = new MyHr();
        Scanner scanner = new Scanner(System.in);

        // Menu options for the HR system
        while (true) {
            System.out.println("\nMyHr System");
            System.out.println("1. List all offices");
            System.out.println("2. Create a new employee record");
            System.out.println("3. List all employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear newline

            switch (choice) {
                case 1:
                    hrSystem.listOffices();
                    break;
                case 2:
                    // Gather employee details
                    System.out.print("Enter employee type (Staff/Manager): ");
                    String type = scanner.nextLine();

                    System.out.print("Enter street: ");
                    String street = scanner.nextLine();

                    System.out.print("Enter city: ");
                    String city = scanner.nextLine();

                    System.out.print("Enter county: ");
                    String county = scanner.nextLine();

                    String companyCar = null;
                    if (type.equalsIgnoreCase("Manager")) {
                        System.out.print("Enter company car: ");
                        companyCar = scanner.nextLine();
                    }

                    hrSystem.createEmployee(type, street, city, county, companyCar);
                    break;
                case 3:
                    hrSystem.listEmployees();
                    break;
                case 4:
                    System.out.println("Exiting MyHr system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
