import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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

    public static void searchBus(List<Student> list, int bus) {
        for(Student student : list) {
            if(student.getBus() == bus) {
                System.out.println("Student: " + student.getStLastName() + ", " + student.getStFirstName()
                        + ", Grade: " + student.getGrade() + ", Class: " + student.getClassroom());
            }
        }
        System.out.println();
    }

    public static void searchGrade(List<Student> list, int grade, boolean higLow) {
        float value = 0;
        if(higLow) {
            for(Student student : list) {
                if(student.getGrade() == grade && value < student.getGpa()) {
                    value = student.getGpa();
                }
            }
        }
        else {
            value = 10000;
            for(Student student : list) {
                if(student.getGrade() == grade && value > student.getGpa()) {
                    value = student.getGpa();
                }
            }
        }

        for(Student student : list) {
            if(student.getGrade() == grade && student.getGpa() == value) {
                System.out.println("Student: " + student.getStLastName() + ", " + student.getStFirstName()
                        + ", GPA: " + student.getGpa() + ", Teacher: " + student.gettLastName() + ", "
                        + student.gettFirstName() + ", Bus: " + student.getBus());
            }
        }
        System.out.println();
    }

    public static void searchAverage(List<Student> list, int grade) {
        float total = 0;
        int count = 0;
        for(Student student : list) {
            if(student.getGrade() == grade) {
                total += student.getGpa();
                count++;
            }
        }

        System.out.println("Grade: " + grade + ", Average GPA: " + total/count + "\n");
    }

    public static void totalGradeStudents(List<Student> list) {
        Map<Integer, Integer> unsorted = new LinkedHashMap<>();
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();

        unsorted.put(1, 0);
        unsorted.put(2, 0);
        unsorted.put(3, 0);
        unsorted.put(4, 0);
        unsorted.put(5, 0);
        unsorted.put(6, 0);

        for(Student student : list) {
            unsorted.put(student.getGrade(), unsorted.get(student.getGrade()) + 1);
        }

        unsorted.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        for(Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
        System.out.println();
    }
}
