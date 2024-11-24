class Cat extends Animal{

    public Cat(String type, char gender, int age)
    {
        super(type, gender, age);
    }


    @Override
    public void sound()
    {
        System.out.println("Cat is meowing");
    }


    @Override
    public void eat()
    {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep()
    {
        System.out.println("Cat is sleeping");
    }

    @Override
        public  String toString() 
        {
            return "Animal [type=" + getType() + ", gender=" + getGender() + ", age=" + getAge() + "]";

        }

    
}