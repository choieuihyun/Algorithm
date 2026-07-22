public class day8_bfs_practice_1 {
    
    static boolean[] visited;
    static int[] dist;
    int N;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        visited = new boolean[100000];
        dist = new int[100000];
        
        bfs(0);
    }

    static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        visited[node] = true;
        dist[node] = 0;

        while(!queue.isEmpty()) {
            int cur = queue.poll(); // 현재 위치 하나 뽑아야지

            if (cur == N) {
                System.out.println(dist[cur]);
                return;
            }

            int[] next = {cur+1, cur+3, cur*2};

            for (int n : next) {
                if (n <= 100000 && n >= 0 && !visited[n]) {
                visited[n] = true;
                dist[n] = dist[cur] + 1; // 이게 실제 값에 +를 하는게 아니라는걸 생각해야하는데.. 배열의 인덱스로 값을 쓰니까...
                queue.offer(cur);
                }
            }
        }

    }
}
