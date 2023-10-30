class Check
{
	public static void main(String[] args)
   {
   	     int num=15;
	     boolean f=false;
	     int i;
	     for(i=1;i<=15;i++)
	     {
    		if(num%i==0)
		{
		f=true;
		break;
		}
		if(f==true)
                System.out.println("It is prime");
                else
		System.out.println("It is not prime");
            }
   }
}