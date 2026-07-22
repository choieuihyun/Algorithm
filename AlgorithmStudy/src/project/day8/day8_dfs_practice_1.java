public class day8_dfs_practice_1 {

    static int N;
    static int M;
    static int count;
    static boolean[] visited;
    static ArrayList<Integer>[] graph; // 야이 멍청아 배열 안에 리스트가 들어가는거지 리스트 안에 배열이 들어가는게 아니잖아 ㅋㅋㅋㅋ

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        visited = new int[N+1];
        graph = new ArrayList[N+1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i <= N; i++) {
            int k = scanner.nextInt();
            int p = scanner.nextInt();
            graph[k].add(p);
            graph[p].add(k);
        }

        dfs(1);
    }

    static void dfs(int node) {
        visited[node] = true;

        for (int next : graph[node]) {
            if(!visited[node]) {
                dfs(next);
            }
        }
    }
}
