package November;

import java.util.Arrays;

public class D27 {
    public static void main(String[] args) {
        // 프로그래머스 최솟값 구하기
        D27 D = new D27();
        int[] A = {2, 1};
        int[] B = {4, 3};
        System.out.print(D.solution(A, B));

    }

    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - (i + 1)];
        }

        return answer;
    }

}