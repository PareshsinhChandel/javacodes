class Demo1
{
	public static void main(String [] args)
	{
	   Date1 d1=new Date1(12,12,2012);
	   d1.ShowDate();
	   Date1 d2=new Date1(d1);
	   d2.Date1=(d1);
	}

}