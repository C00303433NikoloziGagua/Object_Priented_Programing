public class Vet
{
    private String name;

    public Vet(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }



    public void setName(String name)
    {
        this.name = name;
    }

    public void Vaccinate(Animal animal)
    {
        System.out.println(name +" is vaccinating");

        if(animal instanceof Dog)
        {
            System.out.println("Dog has been vaccinated" + animal);
        }

        else
        {
            System.out.println("Cat has been vaccinated"  + animal);
        }
    }

}