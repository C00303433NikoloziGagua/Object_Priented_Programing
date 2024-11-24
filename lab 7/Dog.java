class Dog extends Animal{

    public Dog(String type, char gender, int age)
    {
        super(type, gender, age);
    }


    @Override
    public void sound()
    {
        System.out.println("Dog is barking");
    }

    @Override
    public void eat()
    {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep()
    {
        System.out.println("Dog is sleeping");
    }

    @Override
        public String toString() 
        {
            return "Animal [type=" + getType() + ", gender=" + getGender() + ", age=" + getAge() + "]";

        }
}
