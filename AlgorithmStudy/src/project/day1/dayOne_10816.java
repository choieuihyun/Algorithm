package project.dayOne;
import java.util.*;

public class dayOne_10816 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cardCount = scanner.nextInt();

        Map<Integer, Integer> cardMap = new HashMap<>();

        for (int i = 0; i < cardCount; i++) {
            int cardNum = scanner.nextInt();
            cardMap.put(cardNum, cardMap.getOrDefault(cardNum, 0)+1);
        }

        int cardCountAnswer = scanner.nextInt();

        for (int i = 0; i < cardCountAnswer; i++) {
            int cardAnswer = scanner.nextInt();
            System.out.print(cardMap.getOrDefault(cardAnswer, 0) + " ");
        }

    }
}
