import java.util.Scanner;
class code
{
	void facto(int num)
	{
		int i, c=0;
		for(i=1; i<=num; i++)
		{
			if( num%i==0)
			{
			System.out.print(i+" ");
			++c;
			}	
		}
		System.out.print("\nTotal factors "+c);
	}
}


class factors
{

	public static void main(String xyz[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter number to check factors");
		num = sc.nextInt();
		code obj = new code();
		obj.facto(num);
	}

}