package teacher;

public class person {

    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Constructor
    public person() {
        this.name = "null";
        this.age = 0;
    }

    // Parameter 
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override
    public void print() {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
    
}
