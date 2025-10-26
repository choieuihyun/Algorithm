import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Q11399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum = 0;
        int temp = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            list.add(a);
        }

        list.sort(Comparator.comparingInt(o -> o));

        for (int i = 0; i < N; i++) {
            sum += list.get(i);
            temp += sum;


        }
        System.out.print(temp);

    }
}
