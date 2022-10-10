package stadunt;

public class Student {
   int studentId;
 String firstName;
   String lastName;
     int grade;
    int rollNo;

    public Student(int studentId, String firstName, String lastName, int grade, int rollNo) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.rollNo = rollNo;
    }

    void StudentInfo(){
        System.out.println("=========================================");
        System.out.println(this.studentId);
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.grade);
        System.out.println(this.rollNo);

    }
    public static void main(String [] args){
        Student stnt1=new Student(10,"paude ","magar",5,10 );




        stnt1.StudentInfo();




        Student sdnt2=new Student(2,"gopal","Basnet",3,10);
        sdnt2.StudentInfo();

        Student S3 = new Student(2,"ram","chandra",4,10);
        S3.StudentInfo();

    }


}
