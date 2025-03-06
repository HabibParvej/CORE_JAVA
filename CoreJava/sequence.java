class code
{
    int n1=-1, n2=1, n3, i, sum, j;
    void fib(int count){
        for(i=1,j=1;i<=count;i++,j++)
        {   
            n3=n1+n2;
            System.out.print(" "+n3+ " "+(int)Math.pow(2,j));
            n1=n2;
            n2=n3;
        }
    }
}

public class sequence {
    public static void main(String[] args)
    {
	code obj = new code();
	obj.fib(7);
    }
}



//0,2,1,4,1,8,2,16,3,32,5,64,8,...`
//0,1,1,2
