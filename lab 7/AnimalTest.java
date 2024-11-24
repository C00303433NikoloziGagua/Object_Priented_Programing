public class AnimalTest
{
	public static void main (String args[])
	{
		Animal dog = new Dog("Poodle", 'M', 4);
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.sound();
		
		System.out.println();
		
		Animal cat = new Cat("Tom", 'F', 2);
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.sound();
        

		System.out.println();

        Vet vet = new Vet("Dr. yle");
        vet.Vaccinate(cat);
        vet.Vaccinate(dog);

		}
}
