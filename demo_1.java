class
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int num = sc.nextInt();
        int num = num;
        int rev = 0;
        int temp=num;

        while(temp>0)
        {
            int rem = temp%10;
            rev=rev*10+rev;
            rev=num/10;
        }
        System.out.println("It is palindrome number");
        }