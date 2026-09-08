package project.middleTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제: 가장 큰 덩어리 (Largest Blob)
// 문제 설명
// N×M 격자가 주어진다. 각 칸은 1(색칠된 칸) 또는 0(빈 칸)이다.
// 상하좌우로 연결된 1들의 모임을 덩어리라고 한다. (대각선 X)
// 가장 큰 덩어리의 크기(칸 수)를 출력하라. 덩어리가 하나도 없으면 0을 출력한다.
// 입력
// 첫째 줄에 N과 M이 공백으로 주어진다. (1 ≤ N, M ≤ 100)
// 둘째 줄부터 N줄에 걸쳐 격자 정보가 공백으로 구분되어 주어진다.
// 출력
// 가장 큰 덩어리의 크기를 출력한다.
// 예제 입력 1
// 4 5
// 1 1 0 0 0
// 1 0 0 1 1
// 0 0 0 1 1
// 1 1 0 0 0
// 예제 출력 1
// 4
// 검산:
// (0,0) (0,1) (1,0) → 3칸 덩어리
// (1,3) (1,4) (2,3) (2,4) → 4칸 덩어리 ← 최대
// (3,0) (3,1) → 2칸 덩어리
// 가장 큰 건 4
// 예제 입력 2
// 3 3
// 0 0 0
// 0 0 0
// 0 0 0
// 예제 출력 2
// 0
// 덩어리가 없으므로 0.
public class LargestBlob {

    static int N;
    static int M;
    static boolean[][] visited;
    static int[][] map;
    static int size = 0;
    static int answer = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N][M];
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 덩어리 찾는거니까 main에서 for문
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    size = 0;
                    dfs(i, j);
                    answer = Math.max(size, answer);
                }
            }
        }

        // 덩어리 찾는거니까 main에서 for문
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    answer = Math.max(dfsReturn(i, j), answer);
                }
            }
        }

        System.out.println(answer);
    }

    // visited 체크를 안해주면 방문했던 곳을 또 방문함
    // 바이러스나 토마토 뭐 이런 문제처럼 숫자가 직접 변하는게 아니면 숫자로 visited를 대체하지 못함
    static void dfs(int row, int column) {
        visited[row][column] = true;
        size++;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            // 다음 인덱스만 구하면 됨
            int nr = row + dr[i];
            int nc = column + dc[i];

            // nr, nc의 인덱스는 0부터 N-1, M-1 까지로 설정하기 때문에 이렇게 함
            if (nr >= 0 && nr < N && nc >= 0 && nc < M
                && !visited[nr][nc] && map[nr][nc] == 1
            ) {
                dfs(nr, nc);
            }
        }
    }

    static int dfsReturn(int row, int column) {
        visited[row][column] = true;
        int sizeReturn = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int nr = row + dr[i];
            int nc = column + dc[i];

            if (nr >= 0 && nr < N && nc >= 0 && nc < M && !visited[nr][nc] && map[nr][nc] == 1) {
                // 방향 하나하나 갈 때마다 덩어리가 1개씩 늘어나
                sizeReturn += dfsReturn(nr, nc);
            }
        }

        return sizeReturn;
    }
}
