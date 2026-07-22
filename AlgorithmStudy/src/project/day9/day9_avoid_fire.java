import java.util.*;

public class day9_avoid_fire {

    static int N;
    static int M;

    static boolean[][] fireVisited;
    static boolean[][] peopleVisited;
    static char[][] maze;
    static int[][] peopleDist;
    static int[][] fireDist;

    // 시작점이 여러개면 메인에서 for문을 돌려서 queue에 poll을 해야하기 때문에 보통 전역으로 선언한다.
    // bfs문 안에서도 쓰고 메인에서도 쓸꺼거든.
    static Queue<int []> peopleQueue;
    static Queue<int []> fireQueue; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        fireVisited = new boolean[N][M];
        peopleVisited = new boolean[N][M];
        maze = new char[N][M];
        peopleDist = new int[N][M];
        fireDist = new int[N][M];

        peopleQueue = new LinkedList<>();
        fireQueue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String s = scanner.next();
            for (int j = 0; j < M; j++) {
                maze[i][j] = s.chatAt(j);
            }
        }

        // 그래서 시작점이 여러개일때는 메인문에서 for문 돌려서 가능한 지점들 queue에 offer 해주고
        // 마지막에 bfs 한 번 띡 갈기는거임.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (maze[i][j] == 'S') {
                    peopleQueue.offer(new int[]{i, j});
                    peopleVisited[i][j] = true;
                }

                if (maze[i][j] == 'F') {
                    fireQueue.offer(new int[]{i, j});
                    fireVisited[i][j] = true;
                }
            }
        }

    }

    static void bfs() {
        // 시작점 위치 바뀔꺼니까 맨 처음위치 꺼내긴 해야함
        // 아 이게 아니라 Queue에 많이 이미 offer를 했으니 그냥 꺼내서 쓰기만 하면 되나? bfs는 1회 실행이고?
        // bfs에서 사람 시작 위치랑 불 시작 위치가 들어오니까 이건 시작 위치지.

        int[] dr = new int[]{-1, 1, 0, 0};
        int[] dc = new int[]{0, 0, -1, 1};

        // 불의 이동 경로(거리)를 다 계산 후에
        while(!fireQueue.isEmpty()) {
            int[] fire = fireQueue.poll();
            int cfr = fire[0];
            int cfc = fire[1];

            for (int i = 0; i < 4; i++) {
                int nfr = cfr + dr[i];
                int nfc = cfc + dc[i];
                if (nfr > 0 && nfr < N && nfc > 0 && nfc < M
                    && !fireVisited[nfr][nfc] && (maze[nfr][nfc] != '#') 
                { 
                    fireDist[nfr][nfc] = fireDist[cfr][cfc] + 1;
                    fireVisited[nfr][nfc] = true;
                }   
            }
        }

        // 사람을 계산한다.
        while (!peopleQueue.isEmpty()) {
            int[] people = peopleQueue.poll();
            int cpr = people[0];
            int cpc = people[1];

            for (int i = 0; i < 4; i++) {
                int npr = cpr + dr[i];
                int npc = cpc + dc[i];

                // 여기에서 불이 해당 위치에 이미 있으면 사람이 못가게 막는 조건을 건다?
                // 사람 이동 값으로 적용했을 때 사람의 이동 거리가 불의 이동 거리보다 클 시
                if (npr > 0 && npr < N && npc > 0 && npc < M
                    && !peopleVisited[npr][npc] && (maze[npr][npc] != '#'
                    && peopleDist[npr][npc] < fireDist[npr][npc])
                ) {
                    peopleVisited[npr][npc] = true;
                    peopleDist[npr][npc] = peopleDist[cpr][cpc] + 1;
                }
            }
        }
    }
}
