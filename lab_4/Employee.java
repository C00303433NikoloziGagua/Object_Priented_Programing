public class Employee {
    private static int employeenumbercount = 99; // shared across all employees
    private int employeenumber; // unique to each employee
    private String type;
    private String Companycar;
    private address A1; // Address object as a field

    // Constructor
    public Employee(String type, address A1) {
        if (employeenumbercount > 104) {
            throw new IllegalArgumentException("You cannot create more than 5 employees");
        } else {
            this.employeenumber = ++employeenumbercount; // assign and increment
            this.type = type;
            this.A1 = A1; // Assign the address object
        }
    }

    public Employee(String type, address A1, String companycar)
    {
        if (employeenumbercount > 104) {
            throw new IllegalArgumentException("You cannot create more than 5 employees");
        } else {
            this.employeenumber = ++employeenumbercount; // assign and increment
            this.type = type;
            this.A1 = A1; // Assign the address object
        }
        this.Companycar = companycar;
    }

    public int getEmployeenumber() {
        return employeenumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public address getAddress() {
        return A1;
    }

    public void setAddress(address A1) {
        this.A1 = A1;
    }

    @Override
    public String toString() {
        if (type.equalsIgnoreCase("manager") )
        {
        return "Employee number: " + employeenumber + "\nType: " + type + "\nAddress: \n" + A1.toString() + "\ncompanycar: " + Companycar;
        }
        else{
             return "Employee number: " + employeenumber + "\nType: " + type + "\nAddress: \n" + A1.toString();
        }

    }
}