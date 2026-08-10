package project.middleTest;

import java.util.*;

/* 
    🧩 문제: 미로 탈출
    문제 설명
    N×M 크기의 미로가 주어진다. 각 칸은 다음 중 하나다.
    0 : 벽 (이동 불가)
    1 : 이동 가능한 칸
    시작점은 (0,0), 도착점은 (N-1, M-1)이다.
    시작점에서 도착점까지의 최소 이동 횟수를 구하라.
    입력
    첫째 줄에 N, M이 주어진다. (2 ≤ N, M ≤ 100)
    둘째 줄부터 N줄에 걸쳐 미로 정보가 주어진다.
    항상 도달 가능한 입력만 주어진다.
    출력
    최소 이동 횟수를 출력하라. (시작칸과 도착칸도 이동 횟수에 포함)
    예제 입력
    4 6
    1 0 1 1 1 1
    1 0 1 0 1 0
    1 1 1 0 1 1
    0 0 0 0 0 1
    예제 출력
    15
    조건 정리
    시작: (0,0), 도착: (N-1, M-1) --> 이런거 잘 읽어야함. 문제를 잘 읽어서도 가능하겠지만 시작점이 1개로 정해져있는지, 여러개인지는 확인이 필요
    벽(0)은 통과 불가
    대각선 이동 없음 (상하좌우만)
    시작칸, 도착칸 둘 다 이동 횟수에 포함
    항상 도달 가능한 입력만 주어짐
*/

// 최소 횟수, 최단 거리 --> BFS로 알거든?
// BFS는 2차원 배열일 경우 ArrayList<int[]> 로 인덱스를 리스트에 담아서 처리했던 것으로 기억하는데
// 그냥 bfs 다 돌려서 (N-1, M-1) 칸의 값에서 Math.min으로 거르면 되는거라고 생각이 되는데
// 문제 좀 잘 읽어라... 시작점이 하나인 경우와 여러개인 경우를 항상 정리해야함.
public class mazeRunner {
    static int N;
    static int M;
    static int[][] maze;
    static boolean[][] visited;
    static int[][] dist;
    static ArrayDeque<int []> queue;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        // 필요한거 다 초기화
        maze = new int[N][M];
        visited = new boolean[N][M];
        dist = new int[N][M];
        queue = new ArrayDeque<int[]>();

        queue.offer(new int[]{0,0});
        dist[0][0] = 1;
        visited[0][0] = true;

        // 미로 채움
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 미로 채우고
                maze[i][j] = scanner.nextInt();
            }
        }

        // 이 안에서 각 BFS의 (N-1, M-1)의 결과를 다 가져와서 하나씩 Math.min(a,b)를 굴릴 것 같은데...
        // 문제를 보면 미로의 시작은 (0,0)이다.
        // 아래처럼 인덱스 별로 다 추가해서 시작점 정하는건 시작점이 여러개가 가능할 때.
        // for (int i = 0; i < N; i++) {
        //     for (int j = 0; j < M; j++) {
        //         if (maze[i][j] == 1) {
        //             // queue에 미로 자리별 하나씩 넣어줘야지, 단 1일 경우에만.
        //             queue.offer(new int[]{i,j});
        //             visited[i][j] = true;
        //         }
        //     }
        // }

        // DFS와 BFS의 차이
        // DFS는 각 인덱스에서 재귀로 진행하는거라 main의 for문 내에서 인덱스마다 하나하나 dfs(row, column)으로 돌려줘야함
        // BFS는 Queue에서 뽑아서 실행하기 때문에 main문에서는 queue만 채우고 bfs(); 는 for문 바깥에서 한번만 실행
        bfs();

        System.out.println(dist[N-1][M-1]);
    }

    static void bfs() {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        // queue가 비어있지 않아야 시작
        while(!queue.isEmpty()) {
            // 거리측정 시작할 인덱스
            int[] current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int cr = current[0];
                int cc = current[1];

                int nr = cr + dr[i];
                int nc = cc + dc[i];

                if (nr >= 0 && nr < N && nc >= 0 && nc < M
                    && !visited[nr][nc] && maze[nr][nc] == 1
                ) {
                    dist[nr][nc] = dist[cr][cc] + 1;
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }
}
