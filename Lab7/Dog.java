public class Dog  extends Animal 
{
    public Dog(String type, int age, char gender)
        {
            super(type, age, gender);
        }

    public void eat()
        {
            System.out.print("\n" + //
                                "Dog is eating");
        }
    
    public void sleep()
        {
            System.out.print("\n" + //
                                "Dog is sleeping");
        }
    
    public void makeSound()
        {
            System.out.print("\n" + //
                                "Dog is making a sound");
        }

    public String toString()
        {
            return super.toString();
        }
}
