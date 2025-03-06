import java.util.Scanner;

class code
{
	void g(int n1, int n2)
	{
		int gcd = 1;

    		for (int i = 1; i <= n1 && i <= n2; ++i)
		{

      		if (n1 % i == 0 && n2 % i == 0)
        		gcd = i;
    		}

    		System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);	
	}
}



class gcd {
  public static void main(String[] args) {
	int n1, n2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number");
	n1=sc.nextInt();
	System.out.println("Enter the second number");
	n2=sc.nextInt();
   	code obj = new code();
	obj.g(n1, n2);
  }
}