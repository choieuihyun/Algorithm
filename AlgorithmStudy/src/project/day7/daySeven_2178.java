package project.daySeven;

import java.util.*;

public class daySeven_2178 {

    static boolean [][] visited;
    // 이게 미로라 2차원 배열로 한거고, 트리면 1차원 배열 안에 ArrayList를 넣어서 add 하는 방식으로 했을듯
    static int [][] maze;
    static int [][] dist;
    static int N;
    static int M;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        visited = new boolean[N][M];
        maze = new int[N][M];
        dist = new int[N][M];

        for (int i = 0; i < N; i++) {
            String k = scanner.next();
            for (int j = 0; j < M; j++) {
                maze[i][j] = k.charAt(j) - '0';
            }
        }

        // 생각을 해보자. 저 예시를 그려보면 1이 나올때만 count+1 하고 --> 생각을 바꿔야함
        // 1이 나올떄만 count+1이 아닌 1이 나오면 계속 탐색하고 0이 나올 때 다음 행으로 넘어간 후 라고 해야할듯.
        // (N,M)에 닿았을 경우 종료하면 되잖아??
        // 자 그러면 생각을 해보자. 2차원 배열에서 방향을 저장하는 dist[][]를 만들고
        // 여기에 위의 조건대로 1자리에는 1, 0자리에는 -1?

        // 4 6
        // 101111
        // 101010
        // 101011
        // 111011
    }

    static void bfs(int row, int column) {
        // 2차원 배열로 진행하니 당연히 visited도 2차원 배열
        visited[row][column] = true;
        
        // 최단거리 == BFS, 때문에 Queue 사용, Queue에 첫 위치를 넣어두는게 중요하다.
        Queue<int []> queue = new LinkedList<>();
        // 이게 행,열의 위치를 찾는거니 배열을 저장하는거지.
        queue.offer(new int []{row, column}); // 첫 행, 첫 열 바로 넣음

        while(!queue.isEmpty()) {
            int[] cur = queue.poll(); // 현재 값(큐에서 뺀 값)
            int r = cur[0]; // 행
            int c = cur[1]; // 열
            
            int[] dr = {-1, 1, 0, 0}; // 4방향 중 행 (위 아래) 이동 값
            int[] dc = {0, 0, -1, 1}; // 4방향 중 열 (왼쪽 오른쪽) 이동 값

            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d]; // nextRow = row + dr[d](이동 값)
                int nc = c + dc[d];

                if (nr > 0 && nr < N // 다음 행이 범위 내
                    && nc > 0 && nc < M // 다음 열이 범위 내
                    && !visited[nr][nc] // 다음 행,열을 방문하지 않았을 때
                    && maze[nr][nc] == 1) // 다음 행 열이 1일 때(갈 수 있을 때)
                    {
                        visited[nr][nc] = true; // 다음 행,열 방문 처리
                        dist[nr][nc] = dist[r][c] + 1; // 결과값 계산해야하니 다음 행, 열에 이전 행, 열 + 1
                        queue.offer(new int[]{nr, nc}); // queue에 해당 행, 열 넣기.
                }
            }
        }
    }
}
