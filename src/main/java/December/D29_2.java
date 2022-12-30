package December;

import java.util.*;

public class D29_2 {
    public static void main(String[] args) {
        // 프로그래머스 최빈값 구하기
        // 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
        // 정수 배열 array 가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
        int[] num = {1, 1, 1, 1};
        D29_2 D = new D29_2();
        System.out.print(D.solution(num));
    }

    public int solution(int[] array) {
        if ( array.length == 1){
            return array[0];
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int j : array) {
            hm.putIfAbsent(j, 0);
            hm.put(j, hm.get(j) + 1);
            System.out.println(hm.get(j));
        }
        if ( hm.size() == 1) {
            return array[0];
        }
/*
        for (int i = 0; i < array.length; i++) {
            if (hm.get(array[i]) == null){
                hm.put(array[i], 0);
            }
            hm.put(array[i],hm.get(array[i])+1);
            System.out.println(hm.get(array[i]));
        }
*/

        List<Integer> keySet = new ArrayList<>(hm.keySet());
        keySet.sort((o1, o2) -> hm.get(o2) - hm.get(o1));

        System.out.println("==내림차순 정렬==");
        for (Integer key : keySet) {
            System.out.println(String.format("Key : %s, Value : %s", key, hm.get(key)));
        }

        return hm.get(keySet.get(0)).equals(hm.get(keySet.get(1))) ? -1 : keySet.get(0);
    }
}