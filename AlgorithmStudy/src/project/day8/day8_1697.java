public class day8_1697 {

    // 미로같이 특수한 경우에나 따로 하나 2차원 배열이나 그런거 만든다. 문제를 잘 읽는게 중요하다.
    static boolean[] visited; // 방문용 배열
    static int[] dist; // 거리 측정용 배열
    static int N;
    static int K;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        K = scanner.nextInt();
    
        visited = new boolean[100001];
        dist = new int[100001];

        bfs(N);
    }

    static void bfs(int move) {
        Queue<Integer> queue = new LinkedList<>(); // BFS는 큐
        queue.offer(move); // 큐에 처음 값 삽임
        visited[move] = true; // 처음 가는곳 true
        dist[move] = 0; // 처음 움직이는곳 0 삽입

        while(!queue.isEmpty) {
            int cur = queue.poll(); // 현재 값

            if (cur == K) {
                System.out.println(cur);
                return;
            }

            int[] next = {cur+1, cur-1, cur*2}; // 이동 값, 이 이동 값을 어떤 타입, 어떤 값을 넣을지가 굉장히 중요하다.
                      
            for (int n : next) {
                if (N <= 100000 && !visited[n] && N >= 0) {
                    visited[n] = true; // 이동하는곳 true
                    dist[n] = cur + 1; // 거리 + 1, 거리를 어떻게 측정할지는 어떤 수, 어떤 타입이 주어졌을 때 어떻게 처리할 지를 생각하면 된다.
                    queue.offer(n); // 큐에 현재 위치에 사칙연산 값 넣기. 쉽잖아.
                }
            }
        }
    }
}
