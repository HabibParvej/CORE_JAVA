import java.util.Scanner;
class code
{
	void pal(int num)
	{
		int cpy = num, rev = 0, rem;
		while(cpy!= 0)
		{
			rem = cpy % 10;
			rev = rev * 10 + rem;
			cpy = cpy / 10;
		}
		if( rev == num)
		System.out.println("The number is palindrome");
		else
		System.out.println("The number is not a palindrome");
	}
}

class palindrome
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number to check palin");
		num=sc.nextInt();
		code obj = new code();
		obj.pal(num);
	}
}