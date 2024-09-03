import java.util.Scanner;

public class prac17 {
    public static void main(String[] args) {
        Employee e = new Employee("John Doe", 30, "1234567890", "New York", 50000, "Software Engineer");
        Manager m = new Manager("Jane Doe", 40, "9876543210", "Los Angeles", 70000, "Human Resources");
            e.printEmp();
            e.Printsalary();
        m.printMan();
        m.Printsalary();
        System.out.println("23DIT007");
       } 
}

class Member{
  Scanner input = new Scanner(System.in);
   String name = new String();
   int age=0;
   String number = new String();
   String add =new String();
    double salary=0;
    public Member(String n, int age, String phoneNumber, String address, double s) {
        name = n;
        this.age = age;
        number = phoneNumber;
        add = address;
        salary = s;
    }
   
    void Printsalary()
    {
      System.out.println("Salary:  "+salary);
    }
}
 class Employee extends Member{
    String spc = new String();
    public Employee(String n, int age, String phoneNumber, String address, double s, String spec) {
        super(n, age, phoneNumber, address, s);
        spc = spec;
    }
    
   void printEmp()
   {
    System.out.println(":::Printing details of employee:::");
    System.out.println("Name: "+name+"\nAge: "+age+"\nMobile: "+number+"\nAddress: "+add);
    System.out.println("Specialization: "+spc);
   }

}
class Manager extends Member
{
  String dept = new String();
  public Manager(String n, int age, String phoneNumber, String address, double s, String depart) {
    super(n, age, phoneNumber, address, s);
    dept = depart;
  }
  void printMan()
  {
    System.out.println(":::Printing details of Manager:::");
    System.out.println("Name: "+name+"\nAge: "+age+"\nMobile: "+number+"\nAddress: "+add);
    System.out.println("Department: "+dept);
  }
}

