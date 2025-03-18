import java.util.Scanner;

class mail
{
	void emailAddressValidator(String e)
	{
		int l =  e.length();
		int a =e.indexOf('@');
		int d =e.indexOf('.');
		int ad = e.lastIndexOf('@');
		int dd = e.lastIndexOf('.');
        for(int i = 0; i < l; i++)
        {
        	if(e.charAt(i) == ' ')
            System.out.println("Enter Valid Email");
        }
		if (ad == a && a > 0 && d==dd && d > a && d< l -2)
		{	
			System.out.println("Valid Email Address");
		}
		else
		{
			System.out.println("InValid Email Address");

		}
	
	}
}

class Validator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter email");
			String s = sc.next();
			mail obj = new mail();
			obj.emailAddressValidator(s);
		}
	}


}