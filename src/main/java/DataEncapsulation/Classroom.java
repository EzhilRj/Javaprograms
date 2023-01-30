package DataEncapsulation;

public class Classroom {
    private int studentcount ;
    private String subject;

    public int getStudentcount() {
        return studentcount;
    }

    public void setStudentcount(int studentcount) {
        this.studentcount = studentcount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void displaydetails(){

        System.out.println("This is a "+ subject + " Classroom and it has "+ studentcount +" students");
    }
}
