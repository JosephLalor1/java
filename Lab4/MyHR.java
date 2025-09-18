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
            Office office1 = new Office();
            Office office2 = new Office();
            Office office3 = new Office();
            offices[0] = office1;
            offices[1] = office2;
            offices[2] = office3;
            int menuSelect;
            System.out.print(menu());
            menuSelect = EasyIn.getInt();
            while(true)
                {
                    if (menuSelect == 1)
                        {
                            for (int i = 0; i < 3; i++)
                                {
                                    System.out.print(offices[i].toString());
                                }
                        }
                    else if (menuSelect == 2)
                        {
                            Employee employee;
                            String name;
                            int typeSelect;
                            String type = "";
                            String street;
                            String townCity;
                            String county;
                            Address address;
                            System.out.print("\nEnter employee name: ");
                            name = EasyIn.getString();
                            System.out.print("\nSelect employee type:\n1. Staff\n2. Manager");
                            typeSelect = EasyIn.getInt();
                            if (typeSelect == 1)
                                {
                                    type = "Staff";
                                }
                            else if (typeSelect == 2)
                                {
                                    type = "Manager";
                                }
                            System.out.print("\nEnter address street: ");
                            street = EasyIn.getString();
                            System.out.print("\nEnter address town: ");
                            townCity = EasyIn.getString();
                            System.out.print("\nEnter address county: ");
                            county = EasyIn.getString();

                            address = new Address(street, townCity, county);
                            employee = new Employee(address, type, name);
                        }
                }
        }
}
