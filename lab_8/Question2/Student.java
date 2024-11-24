public class Student extends Person {

    private String course; // The course the student is enrolled in

    // Constructor to initialize the student's name and course
    public Student(String name, String course) {
        super(name); // Call the constructor of the superclass (Person) to set the name
        this.course = course; // Set the course field
    }

    @Override
    public String getDescription() {
        // Provide a description of the student, including the course they are studying
        return "A student studying " + course;
    }
}
