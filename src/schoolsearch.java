import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class schoolsearch {
    public static void main(String[] args) {
        String input;
        List<String> inputList;
        StudentList list = new StudentList("students.txt");

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Search Query (hit enter to see options): ");
            input = scan.nextLine();

            inputList = new ArrayList<>(Arrays.asList(input.split(" ")));

            switch (inputList.get(0)) {
                case "S:":
                case "Student:":
                    if (inputList.size() >= 2 && inputList.size() <= 3) {
                        SearchMethods.searchStudent(list.getListStudent(), inputList.get(1),
                                inputList.size() == 3 && (inputList.get(2).equals("B")
                                        || inputList.get(2).equals("Bus")));
                    }
                    break;
                case "T:":
                case "Teacher:":
                    if (inputList.size() == 2) {
                        SearchMethods.searchTeacher(list.getListStudent(), inputList.get(1));
                    }

                    break;
                case "G:":
                case "Grade:":
                    if (inputList.size() == 2) {
                        SearchMethods.searchGrade(list.getListStudent(), Integer.parseInt(inputList.get(1)));
                    } else if (inputList.size() == 3) {
                        if (inputList.get(2).equals("H")
                                || inputList.get(2).equals("High")) {
                            SearchMethods.searchGrade(list.getListStudent(),
                                    Integer.parseInt(inputList.get(1)), true);
                        } else if (inputList.get(2).equals("L")
                                || inputList.get(2).equals("Low")) {
                            SearchMethods.searchGrade(list.getListStudent(),
                                    Integer.parseInt(inputList.get(1)), false);
                        }
                    }
                    break;
                case "B:":
                case "Bus:":
                    if (inputList.size() == 2) {
                        SearchMethods.searchBus(list.getListStudent(), Integer.parseInt(inputList.get(1)));
                    }
                    break;
                case "A:":
                case "Average:":
                    if (inputList.size() == 2) {
                        SearchMethods.searchAverage(list.getListStudent(), Integer.parseInt(inputList.get(1)));
                    }
                    break;
                case "I":
                case "Info":
                    SearchMethods.totalGradeStudents(list.getListStudent());
                    break;
                case "Q":
                case "Quit":
                    System.out.println("Quitting");
                    break;
                default:
                    System.out.println("""
                            Please print either of the following search queries:\s
                            S[tudent]: <lastname> [B[us]]
                            T[eacher]: <lastname>
                            B[us]: <number>
                            G[rade]: <number> [H[igh]|L[ow]]
                            A[verage]: <number>
                            I[nfo]
                            Q[uit]
                            """);
                    break;
            }
        }while(!(input.equals("Quit") || input.equals("Q")));

    }
}