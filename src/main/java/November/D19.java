package November;

import java.util.Arrays;

public class D19 {
    public static void main(String[] args) {
        D19 D = new D19();
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.print(D.solution(numbers));

    }
    public int solution(int[] numbers) {
        int answer = 0;
        String num = Arrays.toString(numbers);

        for (int i = 0; i < 10; i++) {
            String j = Integer.toString(i);
            if (num.contains(j)){
            }else {
                answer += i;
            }
        }
        return answer;
    }

}