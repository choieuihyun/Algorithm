package project.middleTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다. 각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자.
// 단, 회의는 한번 시작하면 중간에 중단될 수 없으며, 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다. 회의의 시작시간과 끝나는 시간이 같을 수도 있다. 이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.
// 입력
// 첫째 줄에 회의의 수 N (1 ≤ N ≤ 100,000)
// 둘째 줄부터 N+1 줄까지 각 회의의 시작시간과 끝나는 시간이 공백으로 구분되어 주어진다
// 시작 시간과 끝나는 시간은 2³¹-1보다 작거나 같은 자연수 또는 0
// 출력
// 첫째 줄에 최대 사용할 수 있는 회의의 최대 개수
// 예제 입력
// 11
// 1 4
// 3 5
// 0 6
// 5 7
// 3 8
// 5 9
// 6 10
// 8 11
// 8 12
// 2 14
// 12 16
// 예제 출력
// 4

public class ConferenceRoom {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[][] meetings = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            meetings[i][0] = start;
            meetings[i][1] = end;
        }

        Arrays.sort(meetings, (a,b) -> {
            if (a[1] == b[1]) {
                return 0;
            }
            return Integer.compare(a[1], b[1]);
        });
    }
}
