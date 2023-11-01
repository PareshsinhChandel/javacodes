class Test
{
	public static void main(String [] args)

	{
	    MyNumber d1=new MyNumber(5);
	    if(d1.negative())
	    System.out.println("It is Negative");
            else
            System.out.println("It is not Negative");
	    
	    if(d1.positive())
	    System.out.println("It is Positive");
            else
            System.out.println("It is not Positive");

	    if(d1.even())
	    System.out.println("It is Even");
            else
            System.out.println("It is not Even");

	    if(d1.odd())
	    System.out.println("It is Odd");
            else
            System.out.println("It is not Odd");

	    if(d1.zero())
	    System.out.println("It is Zero");
            else
            System.out.println("It is not Zero");
	}
}