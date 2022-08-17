package java.School_enrollment_code;

public class teacher extends school {
    int TeacherNumber;
    String subject;

    public teacher() {
        super();
        this.TeacherNumber = 0;
        this.subject = "";
    }

    public teacher(int TeacherNumber, String name, int age, String address, String phone, String email, String subject) {
        super(name, age, address, phone, email);
        this.TeacherNumber = TeacherNumber;
        this.subject = subject;
    }
    public int getTeacherNumber() {
        return TeacherNumber;
    }
    public String getSubject() {
        return subject;
    }
    
    @Override
    public void PrintInfo() {
        System.out.println("Teacher Number: " + TeacherNumber);
        super.PrintInfo();
        System.out.println("Subject: " + subject);
    }

}
