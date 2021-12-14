
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int no;
        no = scan.nextInt();

        switch (no) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            default -> System.out.println("Enter a valid no");
        }

    }
}
