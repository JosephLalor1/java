// Student Name 	: Joseph Lalor
// Student Id Number: 
// Date 			: 16/09/25
// Purpose 			:
public class SavingsAccount 
{
    private static int count = 1;
    private static double annualInterestRate;
    private int accountNum;
    private double savingsBalance;
    private double monthlyInterest;

    public static void modifyInterestRate(double AIR)
        {
            AIR = (AIR / 100);
            annualInterestRate = AIR;
        }
    public SavingsAccount(double bal)
        {
            this.accountNum = count;
            count++;
            savingsBalance = bal;
        }

    public int getAccountNum()
        {
            return accountNum;
        }
    public double getAIR()
        {
            return annualInterestRate;
        }
    public double getBal()
        {
            return savingsBalance;
        }
    public double calculateMonthlyInterest()
        {
            monthlyInterest = savingsBalance * (annualInterestRate / 12);
            savingsBalance = savingsBalance + monthlyInterest;
            return savingsBalance;
        }
}
