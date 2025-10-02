

public class Vet 
{
    private String name;

    public Vet()
        {
            setName("Unknown");
        }

    public Vet(String name)
        {
            setName(name);
        }
    
    public void vaccinate(Animal animal)
        {
            System.out.print("\n" + getName() +" is vaccinating...");
            if(animal instanceof Dog)
                {
                    System.out.print("\nDog has been vaccinated: " + animal.toString());
                }
            else if (animal instanceof Cat)
                {
                    System.out.print("\nCat has been vaccinated: " + animal.toString());
                }
            else 
                {
                    System.out.print("\nAnimal has been vaccinated: " + animal.toString());
                }
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
