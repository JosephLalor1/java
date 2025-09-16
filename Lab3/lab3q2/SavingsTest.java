// Student Name 	: Joseph Lalor
// Student Id Number: 
// Date 			: 16/09/25
// Purpose 			:
public class SavingsTest 
{
    public static void main (String args[])
    {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(4);

        System.out.println("First month balance of saver 1 is: " + saver1.calculateMonthlyInterest());
        System.out.println("First month balance of saver 2 is: " + saver2.calculateMonthlyInterest());

        SavingsAccount.modifyInterestRate(5);

        System.out.println("Second month balance of saver 1 is: " + saver1.calculateMonthlyInterest());
        System.out.println("Second month balance of saver 2 is: " + saver2.calculateMonthlyInterest());
    }
}
