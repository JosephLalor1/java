// Student Name 	: Joseph Lalor
// Student Id Number: 
// Date 			: 16/09/25
// Purpose 			:
public class BankCustomer 
{
    private String name;

    private String address;


    private int numOfAcc;
    SavingsAccount accounts[] = new SavingsAccount[3];

    public BankCustomer(String name, String address)
        {
            setName(name);
            setAddress(address);
            numOfAcc = 0;
        }
    
    public void addAccount(double bal)
        {
            if (numOfAcc < 3)
                {
                    accounts[numOfAcc] = new SavingsAccount(bal);
                    numOfAcc++;
                }
            else
                {
                    System.out.println("3 accounts max");
                }
        }
    public double Balance()
        {
            double balance = 0;
            for (int i = 0; i < numOfAcc; i++)
                {
                    balance = balance + accounts[i].getSavingsBalance();
                }
            return balance;
        }

    public String getName()
        {
            return name;
        }
    public void setName(String name) 
        {
            this.name = name;
        }
    public String getAddress() 
        {
            return address;
        }
    public void setAddress(String address) 
        {
            this.address = address;
        }

    public String Summary()
        {
            String summary = "Customer " + name + ", " + address + " summary:\n";
            for (int i = 0; i < numOfAcc; i++)
                {
                    summary = summary + "Account number " + accounts[i].getAccountNum() + ": " + accounts[i].getSavingsBalance() + "\n";
                }
            return summary;
        }
}
