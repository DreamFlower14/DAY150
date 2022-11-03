package November;

public class D02 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};


        D02 D = new D02();


        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("원본 배열의 %d 인덱스 값 %d X2 를 한 Solution()의 결과값 : %d\n",i, numbers[i],D.solution(numbers)[i]);
        }
    }

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i]*2;
        }
        return answer;
    }
}