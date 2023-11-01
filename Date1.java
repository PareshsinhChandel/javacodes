class Date1
{
	private int dd;
	private int mm;
	private int yy;

	Date1()
	{
	dd=1;
	mm=1;
	yy=2000;
	}

	Date1(int dd,int mm,int yy)
	{
	 this.dd=dd;
	 this.mm=mm;
	 this.yy=yy;
	}
 
	public void ShowDate()
	{
	  System.out.println(dd+"/"+mm+"/"+yy);
	}
	public void ShowDate(Date1 d)
	{
          this.dd=d.dd;
	  this.mm=d.mm;
	  this.yy=d.yy;
	}
}