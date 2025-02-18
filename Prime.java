import java.util.*;
class Prime
{
    public static void main(String a[]) {
       int n;
       int count=0;
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       for(int i=2;i<=n/2;i++){
         if(n%i==0){
            count++;
            break;
         }
       }
        if (count==0){
            System.out.println("Prime Number");
        }
        else
            System.out.println("Not prime");   
    
    }  
    
}