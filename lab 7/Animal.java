public class Animal
{
    private  String type;
        private  char gender;
        private  int age;
    
        public Animal(String type, char gender, int age)
        {
            this.age=age;
            this.gender=gender;
            this.type=type;
        }
    
        public String getType() {
            return type;
        }
    
        public void setType(String type) {
            this.type = type;
        }
    
        public char getGender() {
            return gender;
        }
    
        public void setGender(char gender) {
            this.gender = gender;
        }
    
        public int getAge() {
            return age;
        }
    
        public void setAge(int age) {
            this.age = age;
        }
    
    
        public void eat()
        {
            System.out.println("Animal is eating");
        }
    
        public void sleep()
        {
            System.out.println("Animal is sleeping");
        }
    
        public void sound()
        {
            System.out.println("Animal making sounds");
        }
    
        @Override
        public  String toString() {
            return "Animal [type=" + type + ", gender=" + gender + ", age=" + age + "]";
    }

}