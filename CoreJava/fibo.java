class fun
{
    int n1=0, n2=1, n3, i, sum;
    void code(int count){
        System.out.print(n1+" "+n2);
        for(i=2;i<count;i++)
        {   
            n3=n1+n2;
            sum+=n3;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println("\nThe sum is "+sum);
    }
    
}

class fibo
{
    public static void main(String args[])
    {
        fun obj = new fun();
        obj.code(10);
       
    }
}