// Student Name 	: Joseph Lalor
// Student Id Number: 
// Date 			: 16/09/25
// Purpose 			:
public class Office 
{
    private static int roomNumCount = 100;
    private int roomNum;
    private int numEmp = 0;

    private Employee employees[];
    public Office()
        {
            setRoomNum(roomNumCount);
            roomNumCount++;
            employees = new Employee[2];
            numEmp++;
        }
    
    public void addEmployee(Employee employee)
        {
            if (numEmp < 2)
                {
                    employees[numEmp] = employee;
                }
            else
                {
                    System.out.println("2 employees per office max");
                }
        }

    public int getRoomNum() 
        {
            return roomNum;
        }
    public void setRoomNum(int roomNum) 
        {
            this.roomNum = roomNum;
        }

}
