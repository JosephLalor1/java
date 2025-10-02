public class Cat  extends Animal 
{
    public Cat(String type, int age, char gender)
        {
            super(type, age, gender);
        }

    public void eat()
        {
            System.out.print("\n" + //
                                "Cat is eating");
        }
    
    public void sleep()
        {
            System.out.print("\nCat is sleeping");
        }
    
    public void makeSound()
        {
            System.out.print("\n" + //
                                "Cat is making a sound");
        }

    public String toString()
        {
            return super.toString();
        }
}
