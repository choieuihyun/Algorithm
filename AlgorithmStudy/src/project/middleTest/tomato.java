package project.middleTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// 🧩 문제: 토마토
// 문제 설명

// N×M 상자에 토마토가 담겨 있다. 각 칸은 다음 중 하나다.

// 1 : 익은 토마토
// 0 : 안 익은 토마토
// -1 : 토마토가 없는 칸

// 하루가 지나면 익은 토마토는 상하좌우 인접한 안 익은 토마토를 익게 만든다. (대각선 X)

// 모든 토마토가 익을 때까지 걸리는 최소 날짜를 구하라.

// 입력
// 첫째 줄에 M, N이 주어진다. (2 ≤ N, M ≤ 1000)
// 둘째 줄부터 N줄에 걸쳐 상자 정보가 주어진다.
// 출력
// 모든 토마토가 익을 때까지의 최소 날짜를 출력하라.
// 이미 다 익어 있으면 0.
// 익지 못하는 토마토가 있으면 -1.
// 예제 입력 1
// 6 4
// 0 0 0 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 1
// 예제 출력 1
// 8
// 예제 입력 2
// 6 4
// 0 -1 0 0 0 0
// -1 0 0 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 1
// 예제 출력 2
// -1
// 조건 정리
// 익은 토마토(1)가 여러 개일 수 있음 → 뭘 써야 할지 생각해봐
// -1은 벽처럼 통과 불가
// 대각선 없음
// 이미 다 익었으면 0
// 끝까지 못 익는 칸 있으면 -1

// 근데 이 문제는 어차피 익었으면 1로 바꿔줄꺼니까 
public class tomato {
    static int N;
    static int M;
    static int[][] farm;
    static int[][] dist;
    static ArrayDeque<int []> queue;
    static int count = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        farm = new int[N][M];
        dist = new int[N][M];
        queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < M; j++) {
                farm[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 이걸 까먹으면 어떡하냐..
        // BFS는 큐에 각 인덱스를 넣어서 체크하는건데 인덱스 [i][j] 를 안넣으면 어떡해..
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (farm[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        bfs();

        // 이거 dist[N][M] 에
        // 0 1 2 3 4
        // 2 1 3 2 1
        // 4 2 3 1 5
        // 2 3 1 1 1
        // 2 3 5 1 2
        // 이런식으로 찍히니까 그냥 dist에서 반복분 돌면서 최솟값을 찾으면 되는거네.
        // 근데 어디서 해야하지?

        int answer = 0;
        boolean isBad = false;

        // bfs가 끝났는데 0이 있는 경우가 다 안익은거죵
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (farm[i][j] == 0) {
                    isBad = true;
                }
                answer = Math.max(answer, dist[i][j]);
            }
        }

        if (isBad) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }

    static void bfs() {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while(!queue.isEmpty()) {

            int[] current = queue.poll();
            int currentRow = current[0];
            int currentColumn = current[1];

            for (int i = 0; i < 4; i++) {
                int nr = currentRow + dr[i];
                int nc = currentColumn + dc[i];

                // visited가 필요 없을듯 한데 왜냐? farm 인덱스를 1로 바꿔주는데, 0이어야만 방문하거든.
                if (nr >= 0 && nr < N && nc >= 0 && nc < M && farm[nr][nc] == 0) {
                    farm[nr][nc] = 1;
                    dist[nr][nc] = dist[currentRow][currentColumn] + 1;
                }
            }
        }
    }
}
