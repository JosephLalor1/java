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



    public Employee(Address address, String type, String name)
        {
            setEmployeeNum(employeeNumCount);
            setAddress(address);
            employeeNumCount++;
            count++;
            setType(type);
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
    public void setType(String type) 
        {
            this.type = type;
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
            desc = "Employee num: " + getEmployeeNum() + "\nName: " + getName() + "\nAddress: " + getAddress();
            return desc;
        }
}
