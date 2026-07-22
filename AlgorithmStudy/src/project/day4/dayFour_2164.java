package project.dayFour;

import java.util.*;

public class dayFour_2164 {

    /*
        N장의 카드가 1부터 N까지 순서대로 있어요. 다음 작업을 반복해요.

        맨 위 카드를 버린다
        그 다음 맨 위 카드를 맨 아래로 옮긴다

        카드가 1장 남을 때까지 반복하고 마지막 남은 카드를 출력하세요.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {

            if (queue.size() == 1) {
                System.out.println(queue.peek());
                break;
            }

            queue.poll();
            queue.offer(queue.poll());
        }

    }

}
