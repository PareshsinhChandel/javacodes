class Details
{
   private String Name;
   private Date Bdate;

   Details()
   {
	this.name=new String(" ");
	this.bdate=new Date(" ");
   }

  Details(String name,int dd,int mm,int yy)
   {
	this.Name=new String(Name);
        this.Name=Name;
  	this.Bdate=new Date(dd,mm,yy);
   }

 	public void show()
	{
	      System.out.println("Name :"+name);
	      System.out.println("BirthDate :");
	      Bdate.ShowDate();
	}


}