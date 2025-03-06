// Write a java program to print the following sequence:
// 0,2,1,4,1,8,2,16,3,32,5,64,8,… up to a given limit.
import java.util.*;
import java.lang.Math;
class Seq{
    
    void display(int n){
    int fib1=-1,fib2=1,fib3;
     for(int i=1;i<=n;i++){
     

                 fib3 = fib1 + fib2;
                 
                 System.out.print(fib3);
                 System.out.print(",");
                 fib1 = fib2;
                 fib2 = fib3;
                 //int power = (int)(Math.pow
		System.out.print((int)(Math.pow(2,i)));
		System.out.print(",");
	         
            
    }
       }
}
class Sequence{
        public static void main(String []args) {
    
    System.out.println("Enter the value of N:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Seq obj =new Seq();
    obj.display(n);
        }
    }
