package November;

public class D09 {
    public static void main(String[] args) {
        D09 D = new D09();

        System.out.println(D.solution(	626331));

    }
    public int solution(int num) {
        int answer = 0;
        long number = num;

        while(number > 1){
            System.out.println("number : " + number + " cnt : " + answer);
            if (number % 2 ==0){    // 짝수일 때
                number /= 2;
            }else{  // 홀수일 때
                number = (number * 3) + 1;
            }

            if (answer > 500){
                answer = -1;
                break;
            }else{
                answer++;
            }
        }
        return answer;
    }

}