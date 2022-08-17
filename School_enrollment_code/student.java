package java.School_enrollment_code;

public class student extends school {
    int StudentNumber;

    public student() {
        super();
        this.StudentNumber = 0;
    }

    //constructor
    public student(int StudentNumber, String name, int age, String address, String phone, String email) {
        super(name, age, address, phone, email);
        this.StudentNumber = StudentNumber;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    @Override
    public void PrintInfo() {
       System.out.println("Student Number: " + StudentNumber);
       super.PrintInfo();
    }

    public void changeStudentNumber(int StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

}
