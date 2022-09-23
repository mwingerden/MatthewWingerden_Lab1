import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class schoolsearch {
    public static void main(String[] args) {
        String input;
        StudentList list = new StudentList("students.txt");

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Search Query: ");
            input = scan.nextLine();

            List<String> inputList = new ArrayList<>(Arrays.asList(input.split(" ")));

            if (inputList.get(0).equalsIgnoreCase("")) {
                System.out.println("Please print either of the following search queries: \nS[tudent]: <lastname> [B[us]]\n" +
                        "•T[eacher]: <lastname>\n" +
                        "•B[us]: <number>\n" +
                        "•G[rade]: <number> [H[igh]|L[ow]]\n" +
                        "•A[verage]: <number>\n" +
                        "•I[nfo]\n" +
                        "•Q[uit]\n");
            }
            else if(inputList.get(0).equalsIgnoreCase("s") || input.equalsIgnoreCase("student")) {

            }
            else if(inputList.get(0).equalsIgnoreCase("t") || input.equalsIgnoreCase("teacher")) {

            }
            else if(inputList.get(0).equalsIgnoreCase("b") || input.equalsIgnoreCase("bus")) {

            }
            else if(inputList.get(0).equalsIgnoreCase("g") || input.equalsIgnoreCase("grade")) {

            }
            else if(inputList.get(0).equalsIgnoreCase("a") || input.equalsIgnoreCase("average")) {

            }
            else if(inputList.get(0).equalsIgnoreCase("i") || input.equalsIgnoreCase("info")) {

            }
            else {

            }
        }while(!(input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("q")));

    }
}