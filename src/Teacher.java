public class Teacher {
    private String firstName;
    private String lastName;
    private String emailId;

public Teacher(String firstName, String lastName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }
    void TeacherInfo(){
        System.out.println("======================");
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.emailId);
    }

    public static void main(String[] args) {
        Teacher Tcr1=new Teacher("Shyam","subedhi","Shayam123@gmail.com");
        Tcr1.TeacherInfo();


        Teacher Tcr2=new Teacher("kamal","thapa","kamal123@gmail.com");
        Tcr2.TeacherInfo();
    }

}
