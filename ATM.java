import java.util.*;
class BankAccount{
    
    int AccountNumber;
    double balance=0;
            
    BankAccount(int num,int bal)
    {
        this.AccountNumber = num ;
        this.balance = bal;
       
    }
    void withdraw(double amount){
        
        if (balance<amount){System.out.println("No Available Balance:");}
	else{
	balance = balance - amount;
        System.out.println("Your Balance is :" +balance);}
	
         
    }
    void deposit(double amount){
	if (amount > 0 & amount <= 10000){
        balance = balance + amount;
 	System.out.println("Your Balance is :" +balance);}
        else{System.out.println("Amount Cannot be Greater than 10000");}
    }
        
}
class ATM{

    public static void main(String []args) 
	{
    BankAccount cust1 = new BankAccount(10111,10000);
    //BankAccount cust2 = new BankAccount(10177,50000);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1 for deposite AND 2 for withdraw:");
    int n = sc.nextInt();
    if (n == 1){
    System.out.println("Enter the Amount:");
    double amount = sc.nextDouble();
    cust1.deposit(amount);
      }
    else if (n == 2){
      System.out.println("Enter the Amount:");
    double amount = sc.nextDouble();
    cust1.withdraw(amount);
      }
    else 
       System.out.println("Enter Valid Option");
        }
    }
 