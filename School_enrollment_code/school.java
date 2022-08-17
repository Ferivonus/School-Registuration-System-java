package java.School_enrollment_code;

public abstract class school {
    String name;
    int age;
    String address;
    String phone;
    String email;

    public school() {
        this.name = "";
        this.age = 0;
        this.address = "";
        this.phone = "";
        this.email = "";
    }
    
    public school(String name, int age, String address, String phone, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    
    public void changeName(String name) {
        this.name = name;
    }
    
    public void changeAge(int age) {
        this.age = age;
    }
    
    public void changeAddress(String address) {
        this.address = address;
    }
    
    public void changePhone(String phone) {
        this.phone = phone;
    }
    
    public void changeEmail(String email) {
        this.email = email;
    }

    public void PrintInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }

}
