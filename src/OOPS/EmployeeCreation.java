package OOPS;

public class EmployeeCreation{

    //Method 1. Initialize class variables using object Directly
    int empid;
    String Empname;
    int salary;

    void display() {

        System.out.println(empid);
        System.out.println(Empname);
        System.out.println(salary);


    }

    public static void main(String[] args) {

        EmployeeCreation ezhil = new EmployeeCreation();
        ezhil.empid = 45567;
        ezhil.Empname = "EzhilRaj";
        ezhil.salary = 45000;
        ezhil.display();

        EmployeeCreation priyan = new EmployeeCreation();
        priyan.empid = 35878;
        priyan.Empname = "Priyan";
        priyan.salary = 10000;
        priyan.display();


    }
}
