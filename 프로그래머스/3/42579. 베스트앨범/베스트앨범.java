import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 장르별 재생 수 합계
        HashMap<String, Integer> sum = new HashMap<>();

        // 장르별 곡 고유번호와 재생 수 저장
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>();

        // 장르별로 재생 수와 곡 정보 저장
        for (int i = 0; i < genres.length; i++) {
            // 장르별 재생 수 합계 업데이트
            if (sum.containsKey(genres[i])) {
                sum.put(genres[i], sum.get(genres[i]) + plays[i]);
                music.get(genres[i]).put(i, plays[i]);
            } else {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                music.put(genres[i], map);
                sum.put(genres[i], plays[i]);
            }
        }

        // 장르별 재생 수 내림차순으로 정렬
        List<String> key_set = new ArrayList<>(sum.keySet());
        Collections.sort(key_set, (o1, o2) -> sum.get(o2) - sum.get(o1)); // 장르 재생 수에 따른 정렬

        // 정렬된 장르 순으로 곡의 고유 번호를 추가
        for (String key : key_set) {
            HashMap<Integer, Integer> map = music.get(key);

            // 해당 장르에서 곡들을 재생 수 내림차순으로 정렬
            List<Integer> genreKey = new ArrayList<>(map.keySet());
            Collections.sort(genreKey, (o1, o2) -> map.get(o2) - map.get(o1)); // 재생 수에 따라 정렬

            // 해당 장르에서 가장 많이 재생된 두 곡을 추가
            answer.add(genreKey.get(0));
            if (genreKey.size() > 1) {
                answer.add(genreKey.get(1));
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
