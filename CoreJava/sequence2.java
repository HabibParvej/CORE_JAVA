class code
{
    int n1=-1, n2=1, n3, i, sum, j=-1;
    void fib(int count){
        for(i=1;i<=count;i++,j++)
        {   
            n3=n1+n2;
            System.out.print(" "+n3+ " "+(j));
            n1=n2;
            n2=n3;
	    j= j+-4;
        }
    }
}

public class sequence2 {
    public static void main(String[] args)
    {
	code obj = new code();
	obj.fib(7);
    }
}

//0,-1,1,-4,1,-7,2,-10,3,-13,5,-16,8,...