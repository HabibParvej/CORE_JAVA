import java.util.Scanner;

class code{
		int fact = 1;
		void fac(int n)
		{
			while(n!=0)
			{
				fact =  fact * n;
				n--;
			}
			
		}
		void print()
		{
			System.out.println("The fact "+fact);
		}
}

class factorial{

	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  int  n;
	  System.out.println("Enter the number to cal fact");
	  n=sc.nextInt();
	  code obj = new code();
	  obj.fac(n);	
	  obj.print();	
	
	}
}