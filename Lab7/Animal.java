public class Animal 
{
    private String type;
    private int age;
    private char gender;

    public Animal()
        {
            setType("Unknown");
            setAge(0);
            setGender('U');
        }

    public Animal(String type, int age, char gender)
        {
            setType(type);
            setAge(age);
            setGender(gender);
        }
    
    public void eat()
        {
            System.out.print("\n" + //
                                "Animal is eating");
        }
    
    public void sleep()
        {
            System.out.print("\n" + //
                                "Animal is sleeping");
        }
    
    public void makeSound()
        {
            System.out.print("\n" + //
                                "Animal is making a sound");
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString()
        {
            return "\nType: " + getType() + "\nAge: " + getAge() + "\nGender: " + getGender();
        }
}
