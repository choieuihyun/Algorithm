package project.dayFour;

import java.util.*;

public class dayFour_2606 {

    // 내가 방문했는지 인덱스로 기록할 boolean 배열
    static boolean [] visited;
    // 그래프가 어떻게 연결되어있는지 만들어 줄 ArratList<Integer> 배열 
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computer = scanner.nextInt();
        int connect = scanner.nextInt();

        // 1,2,3,4,5,6,7을 할꺼고, 0번 인덱스는 숫자 0이 없어서 버릴꺼라 computer+1
        visited = new boolean[computer+1];

        for (int i = 1; i <= computer; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i <= connect; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a].add(b); // 양방향이니까 1에 2 연결하고
            graph[b].add(a); // 양방향이니까 2에 1 연결하고
        }

    }

    static void dfs(int node) {
        visited[node] = true;
        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

}





    // dfs는 깊이 탐색이다
    // static void dfs(int node) {
    //     visited 배열은 내가 그래프에서 방문했던 노드를 기록하기 위한 배열이다. 
    //     visited[node] = true; 그래서 여기다가 방문한 노드는 true로 처리해준다.
    //     for (int next : graph[node]) { // 그리고 여기서 graph의 node(graph 배열 내의 ArrayList)의 내부를 탐색해가면서
    //         if (!visited[next]) // 만약 ArrayList의 인덱스(1,2,3 등)이 visited 배열 내에서 false다. 그러면 다시 dfs(next)로 방문 처리.
    //             dfs(next);
    //     }
    // }