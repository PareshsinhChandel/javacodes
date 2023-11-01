class Student
{
   private int id;
   private float percentage;
	
	Student()
             {
            id=101;
	    percentage=75.32f;
             }

	Student(int a,float b)
	     {
	    id=a;
	    percentage=b;
	     }

	public void display()
             {
	    	 if(percentage > 90)
	      	{
          	System.out.println("Excellent");
	        }
	     	if(percentage > 80 && percentage < 90)
	      	{
	     	System.out.println("Very Good");
	       	}else
	     	if(percentage > 70 && percentage < 80)
	  
    	{
	         System.out.println("Good");
	       	}else	
             	if(percentage > 60 && percentage < 70)
	      	{
	   	  System.out.println("Average");
	       	}else
             	if(percentage > 40 && percentage < 60)
	      	{
	    	 System.out.println("Pass");
	       	}
	     	else
	      	System.out.println("Fail");
	       
             }
}