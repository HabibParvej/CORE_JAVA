import java.util.*;
class BankAccount{
    
    int AccountNumber;
    double balance;
            
    BankAccount(int num,int bal)
    {
        this.AccountNumber = num ;
        this.balance = bal;
       
    }
    void withdraw(double amount){
        bal = bal - amount;
        System.out.println("Your Balance is :"+bal);
        if (bal<1){System.out.println("Zero Balance:");}
         
    }
    void deposite(double amount){
        bal = bal + amount;
 	System.out.println("Your Balance is :"+bal)
    }
class ATM{

   void performTransaction(String type, double amount){
    if (type == 1){
        deposite(amount);
        }
    else {
       withdraw(amount);
     }

       

   }
    }    

    class ATMsimulator{
        public static void main(String []args) {
    ATM s1 = new ATM()
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter 1 for deposite and 2 for withdraw:");
     int type = sc.nextInt();
     s1.performTransaction(type);
     
      
 
        }
    }
 