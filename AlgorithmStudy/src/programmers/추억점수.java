import java.util.HashMap;
import java.util.Map;

public class 추억점수 {
    class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int [photo.length];
            List<Integer> arrayList = new ArrayList<>();
            Map<String, Integer> hashMap = new HashMap<>();


            for (int i = 0; i < name.length; i++) {
                hashMap.put(name[i], yearning[i]);
            }

            for (int i = 0; i < photo.length; i++) {
                int sum = 0;
                for (int j = 0; j < photo[i].length; j++) {
                    sum += hashMap.getOrDefault(photo[i][j], 0);
                }
                arrayList.add(sum);
            }


            for (int i = 0; i < answer.length; i++) {
                answer[i] = arrayList.get(i);
            }
            return answer;
        }
    }

}
