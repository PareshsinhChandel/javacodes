class Complex
{
   private int real;
   private int imaginary;

   Complex()
   {
      real=3;
      imaginary=5;
   }
 
   Complex(int a, int b)
    {
      real=a;
      imaginary=b;
     }

public void show()

{
     System.out.println(real+"+"+imaginary+"i");
}

}