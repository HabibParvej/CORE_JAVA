public class prime1000 {
    public static void main(String a[])
    {
        int n = 1000,i;
        for( i=2;i<=n;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.print(i+" ");
            }
        }
    }
}
