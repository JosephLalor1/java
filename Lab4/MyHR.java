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
            int menuSelect;
            System.out.print(menu());
            menuSelect = EasyIn.getInt();
            while(true)
                {
                    if (menuSelect == 1)
                        {

                        }
                }
        }
}
