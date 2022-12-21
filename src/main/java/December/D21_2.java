package December;

public class D21_2 {
    public static void main(String[] args) {
        // 프로그래머스 연속된 수의 합
        D21_2 D = new D21_2();
        D.solution(4,14);
    }

    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        System.out.println("num : " + num + " total : " + total);
        int mid;
        int pm;

        // 조건문
        if ( num % 2 != 0){ // num 이 홀수일 때
            mid = total/num;    // 반환하는 정수 배열의 중간값
            pm = num/2;   // 3 -> 1, 5 -> 2


            for (int i = 0; i < num; i++) { // 0,1,2
                answer[i] = mid - pm + i;
                System.out.print(answer[i] + " ");
            }
        }else{  // num 이 짝수일 때
            mid = total/num;
            pm = num/2-1;
            System.out.println("중간값 : " + mid + "\n플러스 마이너스 값 : " + pm);

            for (int i = 0; i < num; i++) { // 0,1,2,3
                answer[i] = mid - pm + i;
                System.out.println(answer[i] + " ");
            }
        }

        return answer;
    }
}
