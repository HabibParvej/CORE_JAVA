import java.util.Scanner;
class code
{

    void seq(int n)
	{
		int i;
		double  sum=0.00d;
		for(i=1; i<=n; i++)
		{
			
			System.out.print(i+"/"+fac(i) + " + ");
			sum = sum + (double)(i/fac(i));

		}
 		System.out.println("\nThe sum of above series is "+ sum);

    }
    int fac(int n)
		{
			int fact = 1;
			while(n!=0)
			{
				fact =  fact * n;
				n--;
			}
		return fact;
			
		}
}

public class sequence4 {
    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter range");
	int n = sc.nextInt();
	code obj = new code();
	obj.seq(n);
    }
}


//1/1! +1/2!+1/3!.....