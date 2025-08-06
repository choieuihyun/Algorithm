import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class 괄호회전하기 {
    class Solution {
        public int solution(String s) {
            int answer = 0;
            Queue<Character> queue = new ArrayDeque<>();

            for (int i = 0; i < s.length(); i++) {
                queue.add(s.charAt(i));
            }

            for (int i = 0; i < s.length(); i++) {
                if (isValid(queue)) {
                    answer++;
                }

                queue.add(queue.poll());
            }

            return answer;
        }

        static boolean isValid(Queue<Character> queue) {
            Stack<Character> stack = new Stack<>();
            for (char c : queue) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (c == ')' || c == '}' || c == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        char top = stack.pop();
                        if ((c == ')' && top != '(') ||
                                (c == '}' && top != '{') ||
                                (c == ']' && top != '[')) {
                            return false;
                        }
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
