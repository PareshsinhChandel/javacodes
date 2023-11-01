class Date2
{
   private int dd;
   private int mm;
   private int yy;
   static int count;

	Date2()
	{
	    int dd=1;
	    int mm=1;
	    int yy=2201;
	}
	Date2(int a,int b,int c)
	{
	    this.dd=a;
	    this.mm=b;
	    this.yy=c;
	}
	static
	{
	    count=0;
	}
	public void show()
	{
	    	count++;
		System.out.println(dd+"/"+mm+"/"+yy);
	}
}