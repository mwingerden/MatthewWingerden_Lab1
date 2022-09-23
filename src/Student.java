public class Student {
    String stLastName;
    String stFirstName;
    int grade;
    int classroom;
    int bus;
    float gpa;
    String tLastName;
    String tFirstName;


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

    public String getStLastName() {
        return stLastName;
    }

    public void setStLastName(String stLastName) {
        this.stLastName = stLastName;
    }

    public String getStFirstName() {
        return stFirstName;
    }

    public void setStFirstName(String stFirstName) {
        this.stFirstName = stFirstName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public int getBus() {
        return bus;
    }

    public void setBus(int bus) {
        this.bus = bus;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getTLastName() {
        return tLastName;
    }

    public void setTLastName(String tLastName) {
        this.tLastName = tLastName;
    }

    public String getTFirstName() {
        return tFirstName;
    }

    public void setTFirstName(String tFirstName) {
        this.tFirstName = tFirstName;
    }

    @Override
    public String toString() {
        return this.stLastName + ", " + this.stFirstName + ", " + this.grade + ", " + this.classroom + ", " + this.bus
                + ", " + this.gpa + ", " + this.tLastName + ", " + this.tFirstName;
    }
}
