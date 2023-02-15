package February;

public class D15 {
    public static void main(String[] args) {
        // 프로그래머스 가까운 수
        // 정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.

        D15 D = new D15();

        int[] num = {3, 10, 28};
        System.out.print(D.solution(num,20));
    }

    public int solution(int[] array, int n) {
        int answer = 0;

        for(int i = 0; i < array.length; i++){  // 0, 1, 2
            if(array[i] >= n){  //
                answer = array[i] - n;
            }
        }
        return answer;
    }
}