import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q11478 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        Set<String> stringSet = new HashSet<String>();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i+1; j <= S.length(); j++) {
                stringSet.add(S.substring(i,j));
                System.out.print(S.substring(i,j) + " ");
            }
        }

        System.out.print(stringSet.size());
    }
}
