import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        List<Integer> arrayA = new ArrayList<>();
        List<Integer> arrayB = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            arrayA.add(scanner.nextInt());
        }

        for (int i = 0; i < a; i++) {
            arrayB.add(scanner.nextInt());
        }

        int result = 0;
        arrayA.sort(Integer::compareTo);
        arrayB.sort((x,y) -> Integer.compare(y,x));

        for (int i = 0; i < a; i++) {
            result += arrayA.get(i) * arrayB.get(i);
        }

        System.out.println(result);
    }
}
