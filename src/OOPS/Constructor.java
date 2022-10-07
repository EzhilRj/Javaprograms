package OOPS;

public class Constructor {

    //Assigning values to class variables using Constructor
    int empid;
    String Empname;
    int salary;

    Constructor(int id, String name, int sal) {

        empid = id;
        Empname = name;
        salary = sal;

    }

    void display() {

        System.out.println(empid);
        System.out.println(Empname);
        System.out.println(salary);


    }

    public static void main(String[] args) {

        Constructor emp1 = new Constructor(101, "santhosh", 45000);
        emp1.display();


    }

}

