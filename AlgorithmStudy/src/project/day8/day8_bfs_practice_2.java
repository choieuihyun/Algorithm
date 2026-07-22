public class day8_bfs_practice_2 {
    static int N;
    static int M;
    static boolean[][] visited;
    static int[][] maze;
    static int[][] dist;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        visited = new boolean[N][M];
        maze = new int[N][M];
        dist = new int[N][M];

        for (int i = 0; i < N; i++) {
            String s = scanner.next();
            for (int j = 0; j < M; j++) {
                int c = s.charAt(j) - '0';
                maze[i][j] = c;
            }
        }

        bfs(0,0);
    }

    static void bfs(int row, int column) {
        // 미로라 위치를 찍어줘야하니 Queue 내부에 int[] 배열이 들어갈겨
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, column}); // 처음 동작 때 queue에 첫 위치 넣어줘야지 탐색 시작해야하니
        visited[row][column] = true;
        dist[row][column] = 0;

        // 나 이거 dr이 -1, 1, 0, 0 인게 이해가 잘 안되네, dc도 마찬가지고
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        while(!queue.isEmpty()) {
            int[] cur = queue.poll(); // 큐에서 현재꺼 하나 꺼내야함, 큐 내부 타입 잘 봐야한다.
            int currentRow = cur[0];
            int currentColumn = cur[1];

            if (currentRow == N && currentColumn == M) {
                System.out.println(dist[N][M]);
                break;
            }

            // 이동 값을 계산해야하는데
            for (int i = 0; i < 4; i++) {
                int nr = currentRow + dr[i]; // 다음 행 위치는 현재 int[] cur의 0번(cur[0]) + 움직임(dr[i])
                int nc = currentColumn + dc[i];
                if (maze[nr][nc] != 1 && !visited[nr][nc]
                    && nr >= 0 && nr < N && nc >= 0 && nc < M
                ) {
                    visited[nr][nc] = true;
                    dist[nr][nc] = dist[currentRow][currentColumn] + 1; // 다음 위치의 거리에는 현재 위치의 + 1
                    queue.offer(new int[]{nr, nc}); // 멍청아 큐에는 다음 위치를 넣어줘야지..
                }
            }
        }
    }
}
