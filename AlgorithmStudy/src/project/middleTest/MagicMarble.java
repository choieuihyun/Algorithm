package project.middleTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// 마법 구슬
// 시간 제한 1초 · 메모리 제한 256MB
// 문제
// 크기가 N×N인 격자가 있다. 격자의 행과 열은 1번부터 N번까지 번호가 매겨져 있고, r행 c열의 칸을 (r, c)로 나타낸다.
// 이 격자 위에 M개의 마법 구슬이 놓여 있다. 각 구슬은 위치, 방향, 무게를 가진다. 방향은 상(1), 하(2), 좌(3), 우(4) 중 하나이고, 무게는 모두 서로 다르다. 처음에 한 칸에 두 개 이상의 구슬이 놓이는 경우는 없다.
// 1초마다 아래 일이 순서대로 일어난다.
// 1단계 — 이동
// 모든 구슬이 동시에 자신의 방향으로 한 칸 이동한다. 단, 이동하려는 칸이 격자 밖이라면 그 구슬은 방향을 반대로 바꾼 뒤(상↔하, 좌↔우) 바뀐 방향으로 한 칸 이동한다. 방향이 바뀐 구슬은 이후에도 바뀐 방향을 유지한다.
// 2단계 — 충돌
// 이동이 모두 끝난 뒤, 같은 칸에 두 개 이상의 구슬이 있으면 그 중 무게가 가장 큰 구슬 하나만 남고 나머지는 모두 사라진다.
// 구슬이 서로 자리를 맞바꾸며 지나가는 경우(예: A가 (1,2)→(1,3), B가 (1,3)→(1,2))는 충돌이 아니다. 충돌은 이동이 끝난 시점에 같은 칸에 있는 경우에만 일어난다.
// K초가 지난 후 격자에 남아있는 구슬의 개수를 구하는 프로그램을 작성하시오.
// 입력
// 첫째 줄에 N, M, K가 공백으로 구분되어 주어진다. (2 ≤ N ≤ 50, 1 ≤ M ≤ 100, 1 ≤ K ≤ 1,000, M ≤ N×N)
// 둘째 줄부터 M개의 줄에 각 구슬의 정보 r, c, d, w가 공백으로 구분되어 주어진다. (1 ≤ r, c ≤ N, 1 ≤ d ≤ 4, 1 ≤ w ≤ 10,000)
// d는 구슬의 방향으로 1은 상, 2는 하, 3은 좌, 4는 우를 의미한다. w는 구슬의 무게이며 모든 구슬의 무게는 서로 다르다.
// 출력
// 첫째 줄에 K초가 지난 후 남아있는 구슬의 개수를 출력한다.
// 예제 입력 1
// 3 3 2
// 1 1 2 3
// 2 1 1 1
// 1 2 3 5
// 예제 출력 1
// 2

public class MagicMarble {

    static class Ball {
        int r, c, d, w;
        // r = 행, c = 열, d = 방향, w = 무게
        Ball(int r, int c, int d, int w) {
            this.r = r;
            this.c = c;
            this.d = d;
            this.w = w;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Ball> balls = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            Ball ball = new Ball(r, c, d, w);
            balls.add(ball);
        }

        int[] dr = {0, -1, 1, 0, 0};
        int[] dc = {0, 0, 0, -1 ,1};
        int[] opposite = {0, 2, 1, 4, 3};

        for (int t = 0; t < K; t++) {
            for (Ball b : balls) {
                // 공의 d는 이미 정해져있고, 해당 방향으로 진행하기 때문에(상,하,좌,우가 정해져있음)
                int nr = b.r + dr[b.d];
                int nc = b.c + dc[b.d];

                if (nr >= 1 && nr <= N && nc >= 1 && nc <= N) {
                    b.r = nr;
                    b.c = nc;
                } else {
                    b.d = opposite[b.d];
                    b.r += dr[b.d];
                    b.c += dc[b.d];
                }
            }

            Ball[][] grid = new Ball[N+1][N+1];

            // ball 충돌 처리라..
            // Ball 타입으로 만들었으니 null이면 놓고, 아니면 큰놈이 이겨야함.
            for (Ball b : balls) {
                if (grid[b.r][b.c] == null) {
                    grid[b.r][b.c] = b;
                } else {
                    if (grid[b.r][b.c].w < b.w) {
                        grid[b.r][b.c] = b;
                    }
                }
            }

            List<Ball> next = new ArrayList<>();
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (grid[i][j] != null) {
                        next.add(grid[i][j]);
                    }
                }
            }
            balls = next;
        }

        for (Ball b : balls) {
            System.out.println(b.r + " " + b.c + " " + b.d + " " + b.w);
        }
    }
}
