package January;

public class D17 {
    public static void main(String[] args) {
        // 프로그래머스 배열 회전시키기 [+1]
        // 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
        // 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
        int[] num = {4, 455, 6, 4, -1, 45, 6};

        D17 D = new D17();
        System.out.print(D.solution(num,"left"));
    }

    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if ( direction.equals("right")){
            int temp = 0;
            answer[0] = numbers[numbers.length - 1];
            System.out.println(answer[0]);
            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[temp];
                temp++;
                System.out.println(answer[i]);
            }
        }else{
            int temp = 1;
            answer[numbers.length - 1] = numbers[0];
            System.out.println(answer[numbers.length - 1]);
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[temp];
                temp++;
                System.out.println(answer[i]);
            }
        }
        return answer;
    }
}