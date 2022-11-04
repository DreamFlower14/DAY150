package November;

import java.util.Scanner;

public class D04 {
    public static void main(String[] args) {
        D04 D = new D04();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.printf("%d의 약수들의 합은 : %d", num, D.solution(num));
    }

    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                answer += i;
            }
        }

        return answer;
    }
}