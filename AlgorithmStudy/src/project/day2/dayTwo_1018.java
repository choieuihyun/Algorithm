package project.dayTwo;

import java.util.Scanner;

public class dayTwo_1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        String[] board = new String[N];

        // 1차원 배열로 인덱스 하나에 체스판 한 줄을 기록하는거지.
        for (int i = 0; i < N; i++) {
            board[i] = scanner.next(); // [0]에 WBWBWBWB [1]에 BWBWBWBW 이런식으로 들어감.
        }

        // 총 바꿔야하는 최대 갯수는 64개야. 왜냐? 8X8 체스판이거든.
        int answer = 64;

        for (int r = 0; r <= N-8; r++) { // 가로인데 N-8인 이유? 문제에서 최소 8X8 체스판을 잘라서 판별하기 때문에 뭐 9X9, 10X10 등 다양한 체스판에서 잘라서 쓰기 때문에 이렇게 함
            for (int c = 0; c <= M-8; c++) { // 위와 동일
                int cost = 0;
                for (int i = r; i < r+8; i++) {
                    for (int j = c; j < c+8; j++) {
                        if ((i+j) % 2 == 0) {
                            if (board[i].charAt(j) != 'W') {
                                cost++;
                            }
                        } else {
                            if (board[i].charAt(j) != 'B') {
                                cost++;
                            }
                        }
                    }
                }
                answer = Math.min(answer, Math.min(cost, 64-cost));
            }
        }
        System.out.println(answer);
    }
}
