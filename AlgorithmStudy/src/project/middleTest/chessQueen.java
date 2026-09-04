package project.middleTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제: 퀸 배치 (N-Queen)
// 문제 설명
// N×N 체스판에 퀸 N개를 놓으려고 한다. 서로 공격할 수 없게 놓는 경우의 수를 구하라.
// 퀸은 체스에서 같은 행, 같은 열, 대각선으로 공격한다. 즉 어떤 두 퀸도 같은 행·열·대각선에 있으면 안 된다.
// 입력
// 첫째 줄에 N이 주어진다. (1 ≤ N ≤ 12)
// 출력
// 퀸 N개를 서로 공격 못 하게 놓는 경우의 수를 출력한다.
// 예제 입력 1
// 4
// 예제 출력 1
// 2
// 예제 입력 2
// 8
// 예제 출력 2
// 92

public class chessQueen {

    static int answer = 0;
    static int N;
    static int[] queen;

    static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        queen = new int[N];

        /*
            왜 파라미터가 col인지 생각을 해봐라.
            2차원 배열 안쓰고 1차원 배열로 체크한다고 했잖아.
            퀸은 queen 배열 안에서 돌아다니고, 그 배열(행)에서 이동하는데 열임.
            그러면, 그 배열 안은 어디에서 탐색을 하냐?
            backtrack 내부의 for문으로 배열을 탐색하겠지. 거기에서 배열을 움직이고, 행이 열과 같은걸 체크하는 부분도
            거기에서만 가능하다.
        */ 
        backtrack(0);
    }

    static void backtrack(int col) {
        
        if (col == N) {
            System.out.println(answer);
            return;
        }

        for (int row = 0; row < N; row++) {
            
            if (queen[row] == col) {
                continue;
            }

            // 여기에 대각선
            if () {

            }

            // col + 1 이건 필요없지 않을까? 1이면 퀸이라고 하면 되잖아.
            queen[row] = 1;
            // 이거 col + row 안하면 계속 돌지 않나? 같은 범위?
            backtrack(col + row);
        }
    }
}
