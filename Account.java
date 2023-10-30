class Account
{
	private int accno;
	private double balance;

	Account()
	{
	  accno=1001;
	  balance=10000.00;
	}
	Account(int no,double amount)
	{
	  accno=no;
	  balance=amount;
	}
	public void data()
	{
	  System.out.println("Accont number is:"+accno);
	  System.out.println("Balance is:"+balance);
	}
}