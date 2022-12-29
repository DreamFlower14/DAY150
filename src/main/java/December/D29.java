package December;

import java.util.Arrays;

public class D29 {
    public static void main(String[] args) {
        // 프로그래머스 중앙값 구하기
        // 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
        // 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
        // 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.

        int[] num = {1, 2, 7, 10, 11};
        D29 D = new D29();
        System.out.print(D.solution(num));
    }

    public int solution(int[] array) {
        int answer = 0;
        if((array.length %2 != 0)&&(0<array.length)&&(array.length<100)){

            Arrays.sort(array);

            answer = array[array.length/2];
        }
        return answer;
    }

}