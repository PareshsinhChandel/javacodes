class Arr
{
        
	public static void main(String[] args)
	{
	int []arr = {10,20,30,40,50};

        int low=arr[0];
	int high=arr[0];

	for(int i=0;i<arr.length;i++)
	{
	if(arr[i]<low)
	low=arr[i];
	System.out.println("Lowest number is"+":"+arr[i]);
	}

	for(int i=0;i<arr.length;i++)
	{
	if(arr[i]>low)
	high=arr[i];
	System.out.println("Highest number is"+":"[i]);
	}	
        

	for(int i=0;i<arr.length;i++)
	{
    	    System.out.println("Values of Array"+":"+arr[i]);
	}

	}
}