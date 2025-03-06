import java.util.Scanner;
public class prime {
    public static void main(String a[])
    {
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sk.nextInt();
        int count=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println(n+" is a prime number");
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }
    }
}
