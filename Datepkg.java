package office.utility;
public class Datepkg
{
      int dd;
	int mm;
	int yy;
      
  
	Datepkg(int dd,int mm,int yy)
	{
	       this.dd=dd;
		 this.mm=mm;
	       this.yy=yy;
	}
	
	public void show()
	{
	    System.out.println(dd+"/"+mm+"/"+yy);
	}
}


  