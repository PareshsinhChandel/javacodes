class Interest
{
	private int accno;
	private double balance;
	private float int_rate;

	Interest()
	{
	  accno=1001;
	  balance=10000.00;
	}

	static()
	{
	  int_rate=4.2f;
	}

	Interest(int no,double amount)
	{
	  accno=no;
	  balance=amount;
	}

	public void data()
	{
	  System.out.println("Accont number is:"+accno);
	  System.out.println("Balance is:"+balance);
	}
	public void calc()
	{
	  System.out.println("Amount after interest is :"+int_rate);
	}
}