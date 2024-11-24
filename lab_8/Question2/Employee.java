public class Employee extends Person {

    private double annualSalary; // The annual salary of the employee

    // Constructor to initialize the employee's name and annual salary
    public Employee(String name, double annualSalary) {
        super(name); // Call the constructor of the superclass (Person) to set the name
        this.annualSalary = annualSalary; // Set the annual salary field
    }

    @Override
    public String getDescription() {
        // Provide a description of the employee, including their annual salary
        return "An employee with a salary of " + annualSalary;
    }
}
