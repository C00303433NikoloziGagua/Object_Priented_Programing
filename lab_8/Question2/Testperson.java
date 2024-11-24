public class Testperson {
    public static void main(String[] args) {
        
        // Create an array of Person objects, capable of holding 2 elements (one for Student and one for Employee)
        Person[] people = new Person[2];

        // Assign a Student object to the first index of the array
        people[0] = new Student("Nikolozi", "Software development");
        
        // Assign an Employee object to the second index of the array
        people[1] = new Employee("Jason", 1000000000);

        // Loop through each element in the 'people' array
        for(Person person : people)
        {
            // Print the name of the person
            System.out.println("Name: " + person.getName());
            
            // Print the description of the person using polymorphism
            System.out.println("    Description: " + person.getDescription());
        }
    }
}
