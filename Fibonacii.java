class Fibonacii
{
    public static void main(String a[]) {
       int n=20;   
      int fib1 = 0, fib2 = 1,fib3; 
       for(int i=2;i<=n;i++)
       {
         int count=0;
          for(int j=1;j<=i;j++)
          {
            if(i%j==0)
               count++;
          }
        if (count==2)
            System.out.println("Prime Number:" +i); 

        if (fib1 <= n) {
                System.out.println("Fibonacci: " + fib1);
                fib3 = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib3;
            }
      }  
  
    }
    
}