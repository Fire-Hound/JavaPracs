public class Slip3a{
    public static void main(String[] args) {
        Executive e = new Executive("Bill Gates", 65000,"RichMenClub", "Silicon Valley");
        e.disp();
    }
}
class Employee{
    String Name;
    float Salary;
    Employee(String n, float s){
        Name=n;
        Salary=s;
    }
    void disp(){
        System.out.println("Name: "+Name+ "\nSalary: "+Salary);
    }
}
class Manager extends Employee{
    String Department;
    Manager(String n, float s, String dept){
        super(n,s);
        Department = dept;
    }
    void disp(){
        System.out.println("Name: "+Name+ "\nSalary: "+Salary+"\n Department: "+Department);
    }
}
class Executive extends Manager{
    String Loc;
    Executive(String n, float s,String dept, String l){
        super(n,s,dept);
        Loc = l;
    }
    void disp(){
        System.out.println("Name: "+Name+ "\nSalary: "+Salary+"\n Department: "+Department
        +"\nLocation"+Loc
        );
    }
}