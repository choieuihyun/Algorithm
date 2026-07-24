package project.middleTest;

import java.util.*;

/* 🧩 문제: 연구소 바이러스

    문제 설명
    N×M 크기의 연구소 지도가 주어진다. 각 칸은 다음 중 하나다.
    0 : 빈 칸
    1 : 벽
    2 : 바이러스
    바이러스는 상하좌우로 인접한 빈 칸으로 퍼진다. (대각선 X)
    바이러스가 모두 퍼진 후, 바이러스가 없는 빈 칸의 수를 출력하라.
    입력
    첫째 줄에 N, M이 주어진다. (1 ≤ N, M ≤ 50)
    둘째 줄부터 N줄에 걸쳐 지도 정보가 주어진다.
    출력
    바이러스가 퍼진 후 빈 칸(0)의 수를 출력하라.

    예제 입력
    4 5
    2 0 1 0 0
    0 0 0 0 1
    1 0 0 1 0
    0 1 0 0 0

    예제 출력
    2

    조건 정리
    바이러스는 2로 표시된 칸에서 시작
    벽(1)은 통과 불가
    대각선 이동 없음 (상하좌우만)
    바이러스 시작점이 여러 개일 수 있음

*/

public class Virus {
    static int N;
    static int M;
    static int[][] virusMap;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        N = scanner.nextInt();
        M = scanner.nextInt();

        virusMap = new int[N][M];
        visited = new boolean[N][M];

        // 바이러스가 퍼지지 못한 부분의 갯수
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                virusMap[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (virusMap[i][j] == 2)
                    dfs(i,j);
            }
        }

        // for (int i = 0; i < N; i++) {
        //     System.out.println();
        //     for (int j = 0; j < M; j++) {
        //         System.out.print(virusMap[i][j] + " ");
        //     }
        // }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (virusMap[i][j] == 0)
                    count++;
            }
        }

        System.out.println(count);
    }

    static void dfs(int row, int column) {
        visited[row][column] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int nr = row + dr[i];
            int nc = column + dc[i];

            if (nr >= 0 && nr < N && nc >= 0 && nc < M
                && !visited[nr][nc] && virusMap[nr][nc] != 1
            ) {
                virusMap[nr][nc] = 2;
                dfs(nr, nc);
            }
        }
    }

}
