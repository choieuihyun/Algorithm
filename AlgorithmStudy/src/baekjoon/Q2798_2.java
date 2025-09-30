import java.util.Scanner;

public class Q2798_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int k = j+1; k < array.length; k++) {
                    if (array[i]+ array[j] + array[k] <= M) {
                        max = Math.max(array[i] + array[j] + array[k], max);
                    }
                }
            }
        }

        System.out.println(max);
    }
}
