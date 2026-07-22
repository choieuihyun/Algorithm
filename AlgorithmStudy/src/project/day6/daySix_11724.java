package project.daySix;

import java.util.*;

public class daySix_11724 {
    static boolean [] visited;
    static ArrayList<Integer>[] graph;
    static int nodeCount;
    static int lineCount;
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        nodeCount = scanner.nextInt();
        lineCount = scanner.nextInt();

        visited = new boolean[nodeCount+1];
        graph = new ArrayList[nodeCount+1];

        for (int i = 1; i <= nodeCount; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i <= lineCount; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        
        for (int i = 1; i <= nodeCount; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }

    // dfs는 연결된 노드만 방문한다
    static void dfs(int node) {
        // 방문한 노드는 true
        visited[node] = true;
        // graph(노드), graph[1]이면 1에 연결된 노드들을 탐색하겠다라는 뜻.
        // 그래서 내부에 ArrayList가 있는 graph[1] ~ graph[끝] 까지 탐색해서
        // {1,2,3}, {2,3} 뭐 이런식으로 graph를 다 탐색  
        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            } 
        }
    }
}
