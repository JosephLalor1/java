// Student Name 	: Joseph Lalor
// Student Id Number: 
// Date 			: 16/09/25
// Purpose 			:
public class Driver 
{
    public static void main (String args[])
        {
            BankCustomer customer1 = new BankCustomer("John", "Mulholland Drive");
            BankCustomer customer2 = new BankCustomer("Alice", "The Rabbit Hole");

            customer1.addAccount(2000);
            customer1.addAccount(4000);

            customer2.addAccount(100);
            customer2.addAccount(2000);
            customer2.addAccount(1234);

            System.out.print(customer1.Summary());
            System.out.println("Total: " + customer1.Balance());
            System.out.print(customer2.Summary());
            System.out.println("Total: " + customer2.Balance());

        }
}
