package OOPS;

public class UsingMethod {

    //Assigning values to class variables using Method

    int empid;
    String Empname;
    int salary;

    void setdata(int id, String name, int sal){

        empid = id;
        Empname = name;
        salary = sal;

    }

    void display() {

        System.out.println(empid);
        System.out.println(Empname);
        System.out.println(salary);


    }

    public static void main(String[]args){

        UsingMethod emp1 = new UsingMethod();
        emp1.setdata(101,"Santhosh",45000);
        emp1.display();

    }
}
