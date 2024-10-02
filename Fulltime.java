package teacher;

public class Fulltime extends Teacher {
    private int anualsalary;
    private String unit;

    public int getAnualsalary() {
        return this.anualsalary;
    }

    public void setAnualsalary(int anualsalary) {
        this.anualsalary = anualsalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
        setAge(0);
        setName("null");
        setSubject("null");
    }

    public Fulltime (String name, int age, String subject, int anualsalary, String unit) {
        super(name, age, subject);
        this.anualsalary = anualsalary;
        this.unit = unit;
    }
    public void print() {
        System.out.println("Salary\t:" + anualsalary);
        System.out.println("unit\t:" + unit); 

    }
}

