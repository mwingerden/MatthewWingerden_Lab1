import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentList {
    private final List<Student> listStudent;

    public StudentList(String file) {
        this.listStudent = new ArrayList<>();
        studentListRead(file);
    }

    private void studentListRead(String file) {
        try {
            File in = new File(file);
            Scanner reader = new Scanner(in);
            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                List<String> student = new ArrayList<>(Arrays.asList(data.split(",")));
                if(student.size() == 8) {
                    listStudent.add(new Student(student.get(0), student.get(1), Integer.parseInt(student.get(2)),
                            Integer.parseInt(student.get(3)), Integer.parseInt(student.get(4)),
                            Float.parseFloat(student.get(5)), student.get(6), student.get(7)));
                }
            }
            reader.close();
        }catch(FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Student student: listStudent) {
            output.append(student.toString()).append("\n");
        }

        return output.toString();
    }

    public List<Student> getListStudent() {
        return listStudent;
    }
}
