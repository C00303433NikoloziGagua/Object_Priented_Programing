
class Teacher extends Person {

    private String[] courses;
    private int numCourses; 
    public Teacher(String name, String address) {
        super(name, address);
        this.courses = new String[2];
        this.numCourses = 0; 
    }
    
    
    public boolean addCourse(String course) {
         
        courses[numCourses] = course;
        numCourses++; 
        return true;
        
    }

    public boolean removeCourse(String course) {
        numCourses-= 1;  
        courses[numCourses] = "";
        return true;
    }


    @Override
    public String toString() {
        return "Teacher [Name=" + getName() + ", Address=" + getAddress() + "]";
    }

    

}
