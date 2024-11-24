public abstract class Person {

    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Abstract method for description
    public abstract String getDescription();

    // Override toString method
    @Override
    public String toString() {
        return "Person's Name: " + name;
    }
}
