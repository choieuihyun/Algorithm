package project.middleTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.*;

// 문제: 연결 요소의 개수 (BOJ 11724, 실버 2)
// 문제 설명
// 방향 없는 그래프가 주어졌을 때, 연결 요소(connected component)의 개수를 구하라.
// 연결 요소란 서로 연결된 정점들의 집합이다. 서로 이동할 수 있는 정점끼리는 같은 연결 요소에 속한다.
// 입력
// 첫째 줄에 정점의 개수 N과 간선의 개수 M이 주어진다. (1 ≤ N ≤ 1000, 0 ≤ M ≤ N×(N-1)/2)
// 둘째 줄부터 M개의 줄에 간선의 양 끝점 u, v가 주어진다. (1 ≤ u, v ≤ N, u ≠ v)
// 같은 간선은 한 번만 주어진다.
// 출력
// 연결 요소의 개수를 출력한다.
// 예제 입력 1
// 6 5
// 1 2
// 2 5
// 5 1
// 3 4
// 4 6
// 예제 출력 1
// 2
// 검산:
// 간선 1-2, 2-5, 5-1 → 정점 {1, 2, 5}가 한 덩어리
// 간선 3-4, 4-6 → 정점 {3, 4, 6}이 한 덩어리
// 두 덩어리 사이엔 간선 없음 → 2개 
// 예제 입력 2
// 6 8
// 1 2
// 2 5
// 5 1
// 3 4
// 4 6
// 5 4
// 2 4
// 2 3
// 예제 출력 2
// 1
// 검산:
// 1-2-5 덩어리와 3-4-6 덩어리가 5-4, 2-4, 2-3 간선으로 이어짐
// 정점 6개가 전부 하나로 연결 → 1개 
public class ConnectedComponent {
    static int N;
    static int M;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1];
        int count = 0;

        // 자바에서는 배열을 제네릭으로 생성 불가능하다.
        // 제네릭은 컴파일 타임에만 검사하고 런타임에선 검사를 안하는데
        // 배열은 컴파일부터 런타임까지 자기 타입을 고정하고 다니기 때문에 제네릭으로 생성이 불가능하다.
        graph = new ArrayList[N+1];

        // 그래서 여기에서 어떻게 그래프에 넣을것이냐.
        // M번 반복할꺼고, 최대 숫자는 N이 되니까 편하게 U, V 넣어도 될듯?
        // M이 5라고 가정하면 0,1,2,3,4,5
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 1에서 5까지 반복하고
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int U = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            graph[U].add(V);
            graph[V].add(U);
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                count++;
                dfs(i);
            }
        }

        System.out.println(count);
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
