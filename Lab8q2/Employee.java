public class Employee extends Person
{
    private int salary;
    
    public Employee(String name, int salary)
        {
            super(name);
            setSalary(salary);
        }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDescription()
        {
            return "An employee with a salary of: " + getSalary();
        }
}
