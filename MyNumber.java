class MyNumber
{
       private int a;
	
	MyNumber()
	{
        a=0;
	}
	MyNumber(int num)
	{
	this.a=num;
	}
       
	public boolean negative()
	{
	    boolean f1=false;

	    if(a<0)
	    f1=true;
	    return f1;
        }
        public boolean positive()
	{
	    boolean f1=false;

	    if(a>0)
	    f1=true;
	    return f1;
        }
        public boolean even()
	{
	    boolean f1=false;

	    if(a%2==0)
	    f1=true;
	    return f1;
        }
	public boolean odd()
	{
	    boolean f1=false;

	    if(a%2==1)
	    f1=true;
	    return f1;
        }
	public boolean zero()
	{
	    boolean f1=false;

	    if(a==0)
	    f1=true;
	    return f1;
        }
}