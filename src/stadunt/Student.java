package stadunt;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private int grade;
    private int rollNo;


    void createStudent(){
        System.out.println("**Student Details");
        System.out.println(this.studentId);
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.grade);
        System.out.println(this.rollNo);

    }
    public static void main(String args[]){
        Student stnt1=new Student();
        stnt1.studentId=36;
        stnt1.firstName="Harry";
        stnt1.lastName="Basnet";
        stnt1.grade=5;
        stnt1.rollNo=01;


        System.out.println(stnt1.getClass().getName());
        stnt1.createStudent();


        Student stnt2=new Student();
        stnt2.studentId=4;
        stnt2.firstName="laxman";
        stnt2.lastName="Rai";
        stnt2.grade=4;
        stnt2.rollNo=1;

        stnt2.createStudent();


    }


}
