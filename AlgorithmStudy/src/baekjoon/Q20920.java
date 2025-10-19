import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q20920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> dictionary = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            if (S.length() >= M) {
                dictionary.put(S, dictionary.getOrDefault(S, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(dictionary.entrySet());
        list.sort((o1, o2) -> {

            if (o1.getValue() != o2.getValue()) {
                return o2.getValue() - o1.getValue();
            }

            if (o1.getKey().length() != o2.getKey().length()) {
                return o2.getKey().length() - o1.getKey().length();
            }

            return o1.getKey().compareTo(o2.getKey());
        });

        for (Map.Entry<String, Integer> a : list) {
            sb.append(a.getKey()).append("\n");
        }

        System.out.print(sb);
    }
}
