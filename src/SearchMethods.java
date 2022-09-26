import java.util.List;

public class SearchMethods {
    public static void searchStudent(List<Student> list, String lastName, boolean bus) {
        if(bus) {
            for(Student student : list) {
                if(lastName.equalsIgnoreCase(student.getStLastName())) {
                    System.out.println("Student: " + student.getStLastName() + ", " + student.getStFirstName()
                            + ", Bus Route: " + student.getBus());
                }
            }
            System.out.println();
        }
        else {
            for(Student student : list) {
                if(lastName.equalsIgnoreCase(student.getStLastName())) {
                    System.out.println(student);
                }
            }
            System.out.println();
        }
    }

    public static void searchTeacher(List<Student> list, String lastName) {
        for(Student student : list) {
            if(lastName.equalsIgnoreCase(student.gettLastName())) {
                System.out.println("Student: " + student.getStLastName() + ", " + student.getStFirstName());
            }
        }
        System.out.println();
    }

    public static void searchGrade(List<Student> list, int grade) {
        for(Student student : list) {
            if(student.getGrade() == grade) {
                System.out.println("Student: " + student.getStLastName() + ", " + student.getStFirstName());
            }
        }
        System.out.println();
    }
}
