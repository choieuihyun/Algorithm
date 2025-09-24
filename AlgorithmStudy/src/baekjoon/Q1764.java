import java.util.*;

public class Q1764 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<String> result = new ArrayList<>();
        int count = 0;

        Map<String, Integer> notListen = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = scanner.next();
            notListen.put(name, 1);
        }

        for (int i = 0; i < M; i++) {
            String name = scanner.next();
            if (notListen.containsKey(name)) {
                result.add(name);
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for(String name : result) {
            System.out.println(name);
        }
    }
}
