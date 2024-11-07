

class Student extends Person {

    private String[] courses;
    private int[] grades;
    private int numCourses; 
    private double averageGrade;

    
    public Student(String name, String address) {
        super(name, address);  
        this.courses = new String[2];  
        this.grades = new int[2];     
        this.numCourses = 0;        
        
    }

    // Getters & Setters
    public int getNumCourses() {
        return numCourses;
    }



    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;  
    }

    

    
    public double getAverageGrade() {
        double sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        if (numCourses > 0) {
            averageGrade = sum / numCourses;
        }
        return averageGrade;
    }

    public void printGrades() {
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Course: " + courses[i] + " - Grade: " + grades[i]);
        }
    }

    public String toString() {
        return getName() + "(" + getAddress() + ")";
     }
  }
   


