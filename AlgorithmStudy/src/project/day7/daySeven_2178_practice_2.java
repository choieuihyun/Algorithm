package project.daySeven;

import java.util.*;

public class daySeven_2178_practice_2 {

    static int N;
    static int M;
    static int [][] maze; // 미로가 2차원 배열로 표현되어야함.
    static boolean [][] visited; // 미로가 2차원이니 방문한 지점도 2차원이겠지
    static int [][] dist; // 미로가 2차원이니 거리를 저장할 배열도 2차원으로 해야지.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        maze = new int[N][M];
        visited = new boolean[N][M];
        dist = new int[N][M];

        // 미로 값 넣기 완성
        for (int i = 0; i < N; i++) {
            String k = scanner.next();
            for (int j = 0; j < M; j++) {
                int c = k.charAt(j) - '0';
                maze[i][j] = c;
            }
        }
    }

    static void bfs(int row, int column) {
        visited[row][column] = true;
        // bfs니까 Queue 써주시고
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int[]{row, column}); // 큐에 첫 행, 첫 열은 들어가야지
        
        int[] dr = {-1, 1, 0, 0}; // dr은 deltaRow, 행 이동 값, 위로 가면 -1, 아래로 가면 +1
        int[] dc = {0, 0, -1, 1}; // dc는 deltaColumn, 열 이동 값, 왼쪽으로 가면 -1, 오른쪽으로 가면 +1

        // 미로에선 상하좌우 4방향으로 움직이니 d(delta)의 범위는 4.
        for (int d = 0; d < 4; d++) {
            int[] current = queue.poll(); // 들어간 현재 배열(위치)을 꺼내고
            int nr = r + dr[d];
            int nc = c + dc[d];
        } 
    }
}
