// Student Name 	: Joseph Lalor
// Student Id Number: 
// Date 			: 16/09/25
// Purpose 			:
public class Employee 
{
    private static int employeeNumCount = 1000;
    private int employeeNum;
    private Address address;

    public Employee(Address address)
        {
            setEmployeeNum(employeeNumCount);
            setAddress(address);
            employeeNumCount++;
        }
        
    public int getEmployeeNum() 
        {
            return employeeNum;
        }
    public void setEmployeeNum(int employeeNum) 
        {
            this.employeeNum = employeeNum;
        }
    public Address getAddress() 
        {
            return address;
        }
    public void setAddress(Address address) 
        {
            this.address = address;
        }
}
