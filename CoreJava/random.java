class code
{
	void ran()
	{
		int lower = 1, upper = 100;
		for(int i=1; i<=5; i++){
		int randomNumber = (int)(Math.random() * (upper - lower + 1)) + lower;

    		System.out.println(i+". Random number: " + randomNumber);
		}
	}
}

class random
{
	public static void main(String arg[])
	{
		System.out.println("\n\n.......Generating........ \n");
		code obj = new code();
		obj.ran();
		System.out.println("\n\n\n");
	}
}