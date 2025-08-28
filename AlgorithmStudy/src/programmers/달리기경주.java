import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class 달리기경주 {

    public static void main(String[] args) {
        String[] asdf = {"mumu", "soe", "poe", "kai", "mine"};
        String[] asdfasdf = {"kai", "kai", "mine", "mine"};
        solution(asdf, asdfasdf);
    }

    public static String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playersMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            playersMap.put(players[i], i);
            System.out.print(players[i] + " " + i);
        }

        System.out.println();

        for (int i = 0; i < callings.length; i++) {
            // kai의 위치
            int currentPosition = playersMap.get(callings[i]);

            // 맨 앞이며 계산 안함
            if (currentPosition == 0)
                continue;

            // kai보다 한 칸 앞의 위치
            int frontPosition = currentPosition - 1;

            // 위치 변경
            String temp = players[currentPosition];
            players[currentPosition] = players[frontPosition];
            players[frontPosition] = temp;

            playersMap.put(callings[i], frontPosition);
            playersMap.put(players[currentPosition], currentPosition);
        }

        return players;
    }
}
