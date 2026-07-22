public class daySeven_2178_practice2 {
    static int N;
    static int M;
    static int [][] maze;
    static boolean [][] visited; // boolean으로 해야함.
    static int [][] distance;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        maze = new int[N][M];
        visited = new boolean[N][M];
        distance = new int[N][M];

        // 미로까지 완성
        for (int i = 0; i < N; i++) {
            String k = scanner.next();
            for (int j = 0; j < M; j++) {
                // 소문자는 'a', 대문자는 'A', 숫자는 '0' 을 빼줘야 진짜 걔네의 값을 char로 계산 가능하다.
                char c = k.charAt(j) - '0';
                maze[i][j] = c;
            }
        }
    }

    static void bfs(int row, int column) {
        // Queue에 초기 값은 넣었음.
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, column});

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];

            
        }

        // 상하좌우 이동값
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int d = 0; d < 4; d++) {
            
        }
    }
}
