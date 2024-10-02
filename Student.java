package teacher;

public class Student extends person {
    private int studentnumber;
    private int score;
    private String major;

    public int getstudent() {
		return this.studentnumber;
	}

    public void setstudentnumber (int studentnumber ) {
		this.studentnumber  = studentnumber ;
	}

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Constructor
    public Student() {
        studentnumber = 0;
        score = 0;
        major = "null";
    }

    // Parameter
    public Student (String name, int age, int studentnumber, int score, String major) {
        super(name, age);
        this.studentnumber = studentnumber;
        this.score = score;
        this.major = major;
    }

    // Override
    public void print() {;
        super.print();
        System.out.println("studentnumber: " + studentnumber);
        System.out.println("score: " + score);
        System.out.println("major: " + major);
    }
    
}
