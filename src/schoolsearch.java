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
            System.out.println("Enter Search Query: ");
            input = scan.nextLine();

            inputList = new ArrayList<>(Arrays.asList(input.split(" ")));

            if(inputList.get(0).equals("")) {
                System.out.println("""
                        Please print either of the following search queries:\s
                        •S[tudent]: <lastname> [B[us]]
                        •T[eacher] <lastname>
                        •B[us] <number>
                        •G[rade] <number> [H[igh]|L[ow]]
                        •A[verage] <number>
                        •I[nfo]
                        •Q[uit]
                        """);
            }
            else if(inputList.get(0).equalsIgnoreCase("s") ||
                    inputList.get(0).equalsIgnoreCase("student")) {
                if(inputList.size() >= 2 && inputList.size() <= 3) {
                    SearchMethods.searchStudent(list.getListStudent(), inputList.get(1),
                            inputList.size() == 3 && inputList.get(2).equalsIgnoreCase("b"));
                }
            }
            else if(inputList.get(0).equalsIgnoreCase("t") ||
                    inputList.get(0).equalsIgnoreCase("teacher")) {
                if(inputList.size() == 2) {
                    SearchMethods.searchTeacher(list.getListStudent(), inputList.get(1));
                }

            }
            else if(inputList.get(0).equalsIgnoreCase("g") ||
                    inputList.get(0).equalsIgnoreCase("grade")) {
                if(inputList.size() == 2) {
                    SearchMethods.searchGrade(list.getListStudent(), Integer.parseInt(inputList.get(1)));
                }
                else if(inputList.size() == 3) {
                    if(inputList.get(2).equalsIgnoreCase("h")
                            || inputList.get(2).equalsIgnoreCase("high")) {
                        SearchMethods.searchGrade(list.getListStudent(), true);
                    }
                    else if(inputList.get(2).equalsIgnoreCase("l")
                            || inputList.get(2).equalsIgnoreCase("low")) {
                        SearchMethods.searchGrade(list.getListStudent(), false);
                    }
                }
            }
            else if(inputList.get(0).equalsIgnoreCase("b") ||
                    inputList.get(0).equalsIgnoreCase("bus")) {
                if(inputList.size() == 2) {
                    SearchMethods.searchBus(list.getListStudent(), Integer.parseInt(inputList.get(1)));
                }
            }
            else if(inputList.get(0).equalsIgnoreCase("a") ||
                    inputList.get(0).equalsIgnoreCase("average")) {
                if(inputList.size() == 2) {
                    SearchMethods.searchAverage(list.getListStudent(), Integer.parseInt(inputList.get(1)));
                }
            }
            else if(inputList.get(0).equalsIgnoreCase("i") ||
                    inputList.get(0).equalsIgnoreCase("info")) {
                SearchMethods.totalGradeStudents(list.getListStudent());
            }
        }while(!(input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("q")));

    }
}