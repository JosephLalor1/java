// Student Name 	: Joseph Lalor
// Student Id Number: 
// Date 			: 16/09/25
// Purpose 			:
public class Employee 
{
    private static int employeeNumCount = 1000;
    private static int count = 0;
    private int employeeNum;
    private Address address;
    private String type;
    private String name;
    private String car;



    public Employee(Address address, String name)
        {
            setEmployeeNum(employeeNumCount);
            setAddress(address);
            employeeNumCount++;
            count++;
            setType("Staff");
            setName(name);
        }
    public Employee(Address address, String car, String name)
        {
            setEmployeeNum(employeeNumCount);
            setAddress(address);
            employeeNumCount++;
            count++;
            setType("Manager",  car);
            setName(name);
        }
        
    public int getEmployeeNum() 
        {
            return employeeNum;
        }
    public void setEmployeeNum(int employeeNum) 
        {
            this.employeeNum = employeeNum;
        }
    public String getAddress() 
        {
            return address.toString();
        }
    public void setAddress(Address address) 
        {
            this.address = address;
        }
    public String getType() 
        {
            return type;
        }
    public String getCar() 
        {
            return car;
        }
    public void setType(String type) 
        {
            this.type = type;
        }
    public void setType(String type, String car)
        {
            this.type = type;
            this.car = car;
        }
    public String getName() 
        {
            return name;
        }
    public void setName(String name) 
        {
            this.name = name;
        }
    public static int getCount() 
        {
            return count;
        }

    public String toString()
        {
            String desc;
            desc = "\nEmployee num: " + getEmployeeNum() + "\nName: " + getName() + "\nAddress: " + getAddress() + "\nRole: " + getType();
            if (getType() == "Manager")
                {
                    desc = desc + "\nCar: " + getCar();
                }
            return desc;
        }
}
