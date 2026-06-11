package project.dayFour;

import java.util.*;

public class dayFour_9012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        boolean valid = true;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    valid = false;
                    break;
                }
            }
            stack.pop();
        }

        if (!stack.isEmpty()) valid = false;

        System.out.println(valid ? "YES" : "NO");
    }
}
