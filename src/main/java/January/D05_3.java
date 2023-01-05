package January;

public class D05_3 {
    public static void main(String[] args) {
        // 프로그래머스 진료 순서 정하기 [+1]
        // 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
        // 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.

        int[] num = {1, 2, 3, 4, 5, 6, 7};
        D05_3 D = new D05_3();
        System.out.print(D.solution(num));
        for (int i = 0; i < num.length; i++) {
            System.out.println(D.solution(num)[i]);
        }
    }

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = 1;
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (emergency[i] < emergency[j]){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}