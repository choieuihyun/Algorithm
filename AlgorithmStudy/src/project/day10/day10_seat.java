import java.util.*;

public class day10_seat {

    static int N;
    static boolean[][] visited;
    static char[][] room;
    static int[][] dist;
    static Queue<int []> queue;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
    
        queue = new LinkedList<>();
        visited = new boolean[N][N];
        room = new char[N][N];
        dist = new int[N][N];

        for (int i = 0; i < N; i++) {
            String s = scanner.next();
            
            for (int j = 0; j < N; j++) {
                room[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (room[i][j] == 'P') {
                    // 시작점을 큐에 넣었다 == 시작점은 이미 방문했다 == 시작점 방문 체크
                    // 시작점을 큐에 다 넣어두고 시작, 근데 이게 잘 생갹해야하는게.. 시작점만! 넣어야지 전부 다 넣으면 bfs가 의미가 없다.
                    queue.offer(new int[]{i, j});
                    bfs();
                    visited[i][j] = true;
                }
            }
        }

        // 이게.. BFS를 다 돌고나면 dist가 꽉 찰꺼임
        /*
            P = (1,1) 에서 시작

            dist:
            0 0 0 0 0
            0 0 0 0 0  ← 시작점 dist[1][1] = 0
            0 0 0 0 0
            0 0 0 0 0
            0 0 0 0 0

            BFS 돌고 나면:
            2 1 2 3 4
            1 0 1 2 3
            2 1 2 3 4
            3 2 3 4 5
            4 3 4 5 6

            이렇게 차서 거리를 찾는거임.
        */
        boolean pass = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (room[i][j] == 'P' && dist[i][j] == 1)
                    pass = false;
            }
        }

        System.out.println();
        
    }

    // 시작점이 하나로 정해지면 bfs에 좌표를 넣어주는데
    // 시작점이 여러개일 경우 main의 for문에서 bfs를 돌리기 때문에 문제 X
    static void bfs() {
        // 이게 사람마다 bfs가 다르게 돌테니 visited랑 dist를 초기화 시켜줘야함.
        visited = new boolean[N][N];
        dist = new int[N][N]; 
        
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int cr = current[0];
                int cc = current[1];

                // 다음 위치 계산
                int nr = cr + dr[i];
                int nc = cc + dc[i];
                if (nr < N && nr >= 0
                    && nc < N && nc >= 0
                    && !visited[nr][nc]
                ) {
                    dist[nr][nc] = dist[cr][cc] + 1;
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc})
                }
            }
        }
    }
}
