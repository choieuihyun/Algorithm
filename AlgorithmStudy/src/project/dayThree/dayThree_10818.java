package project.dayThree;

import java.util.*;

public class dayThree_10818 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            String s = scanner.next();

            switch (s) {
                case "push": {
                    stack.push(scanner.nextInt());
                    break;
                }
                case "pop": {
                    if (!stack.isEmpty()) {
                        System.out.println(stack.peek());
                        stack.pop();
                    } else {
                        System.out.println(-1);
                    }
                     break;
                }
                case "size": {
                    System.out.println(stack.size());
                    break;
                }
                case "empty": {
                    if (stack.size() == 0) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                }
                case "top": {
                    if (!stack.isEmpty()) {
                        System.out.println(stack.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                }
                default:
                    break;
            }
        }
    }
}
