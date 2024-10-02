package teacher;

public class Parttime extends Teacher {
    
    private int hoursworked;

    public int getHoursworked() {
        return this.hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    // Constructor 
    public Parttime() {
        hoursworked = 0;
        setAge(0);
        setName("null");
        setSubject("null");
    }

    // Parameter 
    public Parttime(String name,String subject, int age, int hoursworked) {
        super(name, age, subject);
        this.hoursworked = hoursworked;
    }
 // Override
 public void print() {
        super.print();
        System.out.println("hoursworked\t:" + hoursworked);
 
    }
}


