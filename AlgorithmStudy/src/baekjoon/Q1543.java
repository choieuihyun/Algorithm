import java.util.Scanner;

public class Q1543 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int count = 0;

        while(str1.contains(str2)) {
            str1 = str1.replace(str2, "A");
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'A') {
                count++;
            }
        }

        System.out.println(count);

    }
}
