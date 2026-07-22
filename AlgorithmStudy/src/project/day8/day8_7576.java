public class day8_7576 {

    static int N;
    static int M;
    static int[][] farm;
    static int[][] dist;
    static boolean[][] visited;
    static int count = 0;
    static Queue<int []> queue;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        farm = new int[N][M];
        dist = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int c = scanner.nextInt();
                farm[i][j] = c;
            }
        }

        queue = new LinkedList<>();

        // 모든 지점에서 bfs를 돌려야하니(이거 모든 지점에서 토마토가 1(익은 상태)로 시작할꺼니까 이런거 있잖아)
        // 시작지점이 하나가 아니면 보통 bfs문 바깥 메인에서 for문을 돌리는 경우가 꽤 있구나
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (farm[i][j] == 1) {
                    queue.offer(new int[]{i, j}); // bfs는 queue로 한다는 것을 잊으면 안됨.
                    visited[i][j] = true;
                }
            }
        }

        bfs();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (farm[i][j] == 0) {
                    System.out.println(-1);
                    break;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                count = Math.max(count,dist[i][j]);
            }
        }

        System.out.println(count);
    }

    static void bfs() {

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int currentRow = cur[0];
            int currentColumn = cur[1];

            // 다음 위치 계산
            for (int i = 0; i < 4; i++) {
                int nr = currentRow + dr[i];
                int nc = currentColumn + dc[i];
                if (nr >= 0 && nc >= 0 && !visited[nr][nc]
                        && nr < N && nc < M && farm[nr][nc] == 0
                ) {
                    visited[nr][nc] = true;
                    farm[nr][nc] = 1;
                    dist[nr][nc] = dist[currentRow][currentColumn] + 1;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }
}
