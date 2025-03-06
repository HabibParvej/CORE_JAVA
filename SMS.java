import java.util.*;
class Student{
    
    private String StudentID,name,course;
    private int age;
    private int []marks = new int[5];
    //int sum;
            
    Student(String id,String name, int a, String c, int m[])
    {
        this.StudentID = id ;
        this.name = name;
        this.course = c;
        this.age = a;
        for(int i=0;i<5;i++)
          marks[i]=m[i];
    }
    void summ(){
        int sum=0;
        for(int i=0;i<5;i++){
            sum = sum + marks[i];
        } 
    }
    void score(){
        int sum=0;
 	for(int i=0;i<5;i++){
            sum = sum + marks[i];
    }

        if (sum >=90)
            System.out.println("GRADE A");
        else if(sum>=75 && sum<90)
            System.out.println("GRADE B");
        else if (sum>=60 && sum<75)
            System.out.println("GRADEcC");
        else if (sum >=40 && sum < 60)
            System.out.println("GRADE D");
        else 
            System.out.println("FAIL");
    }

   void displayDetails()
        {
       
        System.out.println("age:"+age);
        }
    }




    class SMS{
        public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    int marks[]=new int[5];
     System.out.println("Enter the MArks of Five Subject");
    for(int i = 0; i<5;i++){
        marks[i] = sc.nextInt();
    }
    Student s1=new Student("1234","Habib",23,"MCA",marks);
	s1.summ();
	s1.score();
    s1.displayDetails();
        }
    }
 