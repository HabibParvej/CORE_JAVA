import java.util.Scanner;
class code
{
	void pow(int base, int exponent)
	{
		long result = 1;

   		 while (exponent != 0) 
		{
      			result *= base;
      			--exponent;
    		}

    		System.out.println("Answer = " + result);
	}
}

class power {
  public static void main(String[] args) 
{
	
    int base, exponent;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the base ");
	base = sc.nextInt();
	System.out.println("Enter the exponent ");
	exponent = sc.nextInt();
	
	code obj = new code();
	obj.pow(base, exponent);	
	
    
  }
}