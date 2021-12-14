import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        }
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    arr.get(i).add(in.nextInt());
                }
            }

            System.out.println(arr);
        }
    }

