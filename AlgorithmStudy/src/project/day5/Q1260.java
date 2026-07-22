package project.dayFove;

import java.lang.reflect.Array;
import java.util.*;

public class Q1260 {

    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nodeCount = scanner.nextInt(); // 노드 수
        int lineCount = scanner.nextInt(); // 간선 수
        int startNode = scanner.nextInt(); // 시작 노드

        visited = new boolean[nodeCount+1];
        graph = new ArrayList[nodeCount+1];

        for (int i = 1; i < nodeCount+1; i++) {
            graph[i] = new ArrayList<>();
        }

        // 양쪽 연결이니까 a,b로해서 양쪽으로 연결.
        for (int i = 0; i < lineCount; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a].add(b);
            graph[b].add(a);

            // 작은 것 부터 순차적으로 탐색해야하니 Collections.sort 수행.
            Collections.sort(graph[i]);
        }

    }

    static void bfs(int startNode) {
        // BFS -> Queue, DFS -> 재귀
        Queue<Integer> queue = new LinkedList<>();
        // Queue로 판단하기 때문에 startNode(내가 입력할 노드)는 미리 넣어준다.
        queue.offer(startNode);
        // 시작 노드를 방문한 상태로 바꿔준다.
        visited[startNode] = true;

        // 큐가 비어있지 않으면
        while (!queue.isEmpty()) {
            // 큐에서 노드 하나를 빼서
            int node = queue.poll();
            // graph에서 해당 노드{1,2,4} 등을 탐색
            for (int next : graph[node]) {
                // {1,2,4} 등이 방문하지 않았다면
                if (!visited[next]) {
                    // bfs는 재귀로 하는게 아니다. dfs가 재귀이다.
                    // 방문하라고 다시 queue에 넣어줌
                    queue.offer(next);
                }
            }
        }
    }
}

// 그니까 정리하면 DFS는 재귀로 1,4,5 -> 2,3,6 이렇게 쭉쭉 깊이 들어가는건데
// BFS는 queue로 하나씩 빼가면서 1,2,3 -> 2,3 이렇게 가는거임
// 정의는 같지만 구현 방식은 99% 재귀랑 queue다.
