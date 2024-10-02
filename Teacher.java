package teacher;

public class Teacher extends person {
    private String subject;

    
    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    // Constructor
    public Teacher () {
    this.subject = "null";
    super.setAge(0);
    super.setName("null");
    }

    // Parameter
    public Teacher (String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    
    public void print() {
        super.print();
        System.out.println("subject:" + subject);
    }
}
