public class Student {
    private final String stLastName;
    private final String stFirstName;
    private final int grade;
    private final int classroom;
    private final int bus;
    private final float gpa;
    private final String tLastName;
    private final String tFirstName;


    public Student(String stLastName, String stFirstName, int grade, int classroom, int bus, float gpa, String tLastName, String tFirstName) {
        this.stLastName = stLastName;
        this.stFirstName = stFirstName;
        this.grade = grade;
        this.classroom = classroom;
        this.bus = bus;
        this.gpa = gpa;
        this.tLastName = tLastName;
        this.tFirstName = tFirstName;
    }
    @Override
    public String toString() {
        return "Student: " + this.stLastName + ", " + this.stFirstName + ", Grade: " + this.grade + ", Classroom: "
                + this.classroom + ", Bus Route: " + this.bus + ", GPA: " + this.gpa + ", Teacher: " + this.tLastName
                + ", " + this.tFirstName;
    }

    public String getStLastName() {
        return stLastName;
    }

    public String getStFirstName() {
        return stFirstName;
    }

    public int getGrade() {
        return grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public int getBus() {
        return bus;
    }

    public float getGpa() {
        return gpa;
    }

    public String gettLastName() {
        return tLastName;
    }

    public String gettFirstName() {
        return tFirstName;
    }
}
