package project.dayFour;

import java.util.*;

public class dayFour_4949 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.next();
        Stack<Character> stack = new Stack<>();
        boolean valid = true; // 판별 값이 있으면 좋겠죠

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    valid = false;
                    break;
                }
                stack.pop();
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    valid = false;
                    break;
                }

                stack.pop();
            }
        }

        if (!stack.isEmpty())
            valid = false;

        System.out.print(valid ? "YES" : "NO");
    }
}
