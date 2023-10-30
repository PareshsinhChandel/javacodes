class Book
{
   static int bookid;
   private float price;

	Book()
	{
	    price=142.50f;
	}
	Book(float b)
	{
	     this.price=b;
	}

	static
	{
           bookid=101;
	}

	public void display()
	{
	     bookid++;
	     System.out.println("bookid :");
	     System.out.println("price :");
	}


}