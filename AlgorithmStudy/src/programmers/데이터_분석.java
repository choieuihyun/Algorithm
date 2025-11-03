import java.util.*;

class 데이터_분석 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};

        // 여기서 기준 값이 될 값들을 map에 저장.
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("code", 0);
        hashMap.put("date", 1);
        hashMap.put("maximum", 2);
        hashMap.put("remain", 3);

        int extIndex = hashMap.get(ext); // 분류 기준이 될 값
        int sortByIndex = hashMap.get(sort_by); // 정렬 기준이 될 값

        // 기준 값으로 필터링 된 내부 리스트가 필요함.
        List<int[]> filteredList = new ArrayList<>();
        for (int[] innerData : data) {
            // 내부 리스트의 뽑아낸 데이터와 뽑아낸 데이터의 기준 값으로 필터링해야함
            if (innerData[extIndex] < val_ext) {
                filteredList.add(innerData);
            }
        }

        Collections.sort(filteredList, (a,b) -> a[sortByIndex] - b[sortByIndex]);


        return filteredList.toArray(new int [0][]);
    }
}