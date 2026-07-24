package project.middleTest;

/* 
    문제: 섬의 개수
    문제 설명
    N×M 크기의 격자가 주어진다. 격자의 각 칸은 1(육지) 또는 0(바다)이다.
    상하좌우 및 대각선으로 연결된 육지는 하나의 섬으로 간주한다.
    섬의 총 개수를 구하라.

    입력
    첫째 줄에 N, M이 주어진다. (1 ≤ N, M ≤ 50)
    둘째 줄부터 N줄에 걸쳐 격자 정보가 주어진다.
    출력
    섬의 개수를 출력한다.

    예제 입력 1
    5 5
    1 1 0 0 0
    0 1 1 0 0
    0 0 0 0 0
    0 0 0 1 1
    0 0 0 1 1
    예제 출력 1
    2

    예제 입력 2
    3 3
    1 0 1
    0 1 0
    1 0 1
    예제 출력 2
    5
*/

import java.util.*;

public class landCount {
    // 필요한 것 적자
    static int[][] map;
    static boolean[][] visited;
    static int N;
    static int M;
    static int count;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();
        count = 0;

        map = new int[N][M];
        visited = new boolean[N][M];

        // 일단 2차원 배열에 다 채우는건 기본이고요.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        // 이 안에서 count++을 하면 그냥 1마다 다 출력하는거지 dfs를 왜 해.
        // 섬을 찾는거라 index 값이 1이고, 방문하지 않았을 경우에만 가야 섬을 찾지
        // j 반복문에서 안걸려서 dfs 탐색이 전부 끝나면 i 반복문으로 나와야하고.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    count++;
                    dfs(i,j);
                }
            }
        }

        System.out.println(count);
    }

    // count를 올리는 경우가 해당 지점으로부터 4방향 전부 0일 경우 섬이 나눠져있다고 판단하고 count++ 같은데
    static void dfs(int row, int column) {
        visited[row][column] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        // 야 매개변수로 받은 row, column이 인덱스잖아;;
        for(int i = 0; i < 4; i++) {
            int nr = row + dr[i];
            int nc = column + dc[i];
            
            if (nr >= 0 && nr < N && nc >= 0 & nc < M
                && !visited[nr][nc] && map[nr][nc] == 1
            ) {
                dfs(nr, nc);
            } 
        }
    }
}
