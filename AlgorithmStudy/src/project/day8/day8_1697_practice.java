public class day8_1697_practice {
    
    // 단순 숫자 입력이라 maze 이런건 뭐 필요없다.
    static boolean[] visited; // 방문 계산
    static int[] dist; // 거리 계산
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        visited = new boolean[100001];
        dist = new int[100001];
    }

    static void bfs(int node) {
        // 이 아래 세 줄은 거의 뭐 공식.
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        visited[node] = true;
        

        while(!queue.isEmpty()) {
            // 큐에서 현재 값 뽑아내는건 거의 공식이고
            int cur = queue.poll();
            
            if (cur == K) {
                System.out.print(dist[cur]);
                return;
            }

            // 개똥멍청아 저 리턴 후에 작업하게해야 리턴 전에 cur가 변경이 안되어 답이 나올꺼고
            // 여기서 next 내부가 while문 + for문 안에서 돌아서 알아서 cur이 갱신되는데 왜 또 for문에서 cur을 갱신하려드냐
            int[] next = {cur-1, cur+1, cur*2}; // 여기서 현재값이 바뀜 어차피

            for (int n : next) {
                if (n <= 100001 && n >= 0 && !visited[n]) {
                visited[n] = true;
                dist[n] = dist[cur] + 1;
                queue.offer(n);
                }
            }
        }
    }
}
