
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for? ");
        int search = scanner.nextInt();
        int index = 0;
        while (index < list.size()) {
            if (list.get(index) == search) {
                System.out.println( search + " is at index " + index);
            }
            index++;
        }
        

        // implement here finding the indices of a number
    }
}
