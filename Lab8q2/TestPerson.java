public class TestPerson 
{
  	public static void main(String args[])
  	{ 
        Employee employee1 = new Employee("John Smith", 10000);
        Student student1 = new Student("Jane Doe", "Mathematics");
  		Person[] list = new Person[2];
        list[0] = employee1;
        list[1] = student1;

        System.out.println("Employee name: " + employee1.getName() + employee1.getDescription());
        System.out.println("Student name: " + student1.getName() + student1.getDescription());
  	}
}