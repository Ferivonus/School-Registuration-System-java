package java.School_enrollment_code;
import java.util.LinkedList;
import java.util.Scanner;

// solve the problem of school cannot be resolved to a type


public class Project {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<school> School = new LinkedList<school>();
        LinkedList<teacher> Teacher = new LinkedList<teacher>();
        LinkedList<student> Student = new LinkedList<student>();
        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Add School");
            System.out.println("2. Add Teacher");
            System.out.println("3. Add Student");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter School name: ");
                    String name = sc.next();
                    System.out.println("Enter School age: ");
                    int age = sc.nextInt();
                    System.out.println("Enter School address: ");
                    String address = sc.next();
                    System.out.println("Enter School phone: ");
                    String phone = sc.next();
                    System.out.println("Enter School email: ");
                    String email = sc.next();
                    School.add(new school(name, age, address, phone, email));
                    break;
                case 2:
                    System.out.println("Enter Teacher number: ");
                    int TeacherNumber = sc.nextInt();
                    System.out.println("Enter Teacher name: ");
                    String name1 = sc.next();
                    System.out.println("Enter Teacher age: ");
                    int age1 = sc.nextInt();
                    System.out.println("Enter Teacher address: ");
                    String address1 = sc.next();
                    System.out.println("Enter Teacher phone: ");
                    String phone1 = sc.next();
                    System.out.println("Enter Teacher email: ");
                    String email1 = sc.next();
                    System.out.println("Enter Teacher subject: ");
                    String subject = sc.next();
                    Teacher.add(new teacher(TeacherNumber, name1, age1, address1, phone1, email1, subject));
                    break;
                case 3:
                    System.out.println("Enter Student number: ");
                    int StudentNumber = sc.nextInt();
                    System.out.println("Enter Student name: ");
                    String name2 = sc.next();
                    System.out.println("Enter Student age: ");
                    int age2 = sc.nextInt();
                    System.out.println("Enter Student address: ");
                    String address2 = sc.next();
                    System.out.println("Enter Student phone: ");
                    String phone2 = sc.next();
                    System.out.println("Enter Student email: ");
                    String email2 = sc.next();
                    Student.add(new student(StudentNumber, name2, age2, address2, phone2, email2));
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        sc.close();
    }
    
}
