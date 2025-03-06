import java.util.Scanner;
class code
{
  void seq(int n)
	{
		int i, sum = 1;
		for( i=1; i<=n; i++)
		{	
			sum = sum * i;
			System.out.print(2*i + ", " + sum + ", ");
			
		}
	}
}

public class sequence3 {
    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter the range");
	n = sc.nextInt();
	code obj = new code();
	obj.seq(n);
    }
}

//2  4 6 8 10
// 1 2 6 24
//2, 1, 4, 2, 6, 6, 8, 24, 10,