class code
{
	void asci()
	{
	   for (int i= 65 ;i < 90; i++)
		{
			System.out.println( i + "  ------->  " + (char)i);
		}
	}
}

class ascii
{
	public static void main(String args[])
	{
		code obj = new code();
		obj.asci();	
	}

}