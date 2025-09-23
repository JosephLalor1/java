// Student Name 	: Joseph Lalor
// Student Id Number: 
// Date 			: 16/09/25
// Purpose 			:
public class MyHR 
{
    public static String menu()
        {
            String menu = "1. List all offices \n2. Create new employee record \n3. List all employees \nPlease enter your selection: ";
            return menu;
        }
    public static void main (String args[])
        {
            Office offices[] = new Office[3];
            for (int i = 0; i < 3; i++)
                {
                    offices[i] = new Office();
                }
            Employee employees[] = new Employee[5];
            int menuSelect;
            System.out.print(menu());
            menuSelect = EasyIn.getInt();
            while(true)
                {
                    if (menuSelect == 1)
                        {
                            for (int i = 0; i < 3; i++)
                                {
                                    if (offices[i].getNumEmp() > 0)
                                        {
                                            System.out.print(offices[i].toString() + "\n");
                                        }
                                    else    
                                        {
                                            System.out.print("Office number " + offices[i].getRoomNum() + ": empty\n");
                                        }
                                }
                        }
                    else if (menuSelect == 2)
                        {
                            String name;
                            int typeSelect;
                            int officeSelect;
                            String car = "";
                            String street;
                            String townCity;
                            String county;
                            Address address;
                            System.out.print("\nEnter employee name: ");
                            name = EasyIn.getString();
                            System.out.print("\nSelect employee type:\n1. Staff\n2. Manager\n");
                            typeSelect = EasyIn.getInt();
                            if (typeSelect == 2)
                                {
                                    System.out.print("\nWhat type of car does the manager have?\n");
                                    car = EasyIn.getString();
                                }
                            System.out.print("\nEnter address street: ");
                            street = EasyIn.getString();
                            System.out.print("\nEnter address town: ");
                            townCity = EasyIn.getString();
                            System.out.print("\nEnter address county: ");
                            county = EasyIn.getString();

                            address = new Address(street, townCity, county);
                            if (typeSelect == 1)
                                {
                                    employees[Employee.getCount()] = new Employee(address, name);
                                }
                            else if (typeSelect == 2)
                                {
                                    employees[Employee.getCount()] = new Employee(address, car, name);
                                }
                            

                            System.out.print("\nTo which office should the employee be added?\n");
                            for (int i = 0; i < 3; i++)
                                {
                                    System.out.print(offices[i].getRoomNum() + "\n");
                                }
                            officeSelect = EasyIn.getInt();
                            offices[officeSelect - 100].addEmployee(employees[Employee.getCount() - 1]);
                        }
                    else if (menuSelect == 3)
                        {
                            if (Employee.getCount() == 0)
                                        {
                                            System.out.print("There are no employees added!\n");
                                        }
                                    else
                                        {
                                            for (int i = 0; i < Employee.getCount(); i++)
                                                {
                                                    
                                                            System.out.print(employees[i].toString() + "\n");  
                                                }
                                        }
                        }
                    EasyIn.pause("Press Enter to continue");
                    System.out.print(menu());
                    menuSelect = EasyIn.getInt();
                }
        }
}
