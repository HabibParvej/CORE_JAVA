// A Company wants to create a simple employee management system where:
//   Every Employee has a name,employeeID and Salary 
//   A manager is a special type of employee who has an additional attrbute 


class Employee{
      String name;
      int empID;
      int salary;
 void displaydetails(){
     System.out.println("Name: "+name);
     System.out.println("Employee ID: "+empID);
     System.out.println("Salary: "+salary);
 }
    
    }
    
    class Manager extends Employee{
        String Dptname;
        void displaydetails(){
            super.displaydetails();
            System.out.println("Department NAme:"+Dptname);
        }
    }

    class EmployeeMAnagementSystem {
        public static void main(String[] args) {
            Manager m1=new Manager();
            m1.name="Arun";
            m1.empID=101;
            m1.salary=10000;
            m1.Dptname="IT";
            m1.displaydetails();
        }
    }