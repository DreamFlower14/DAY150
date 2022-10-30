package October;

import java.util.Scanner;

public class D30 {
    public int solution(int n){
        int answer = 0;

        if(n%7 == 0){
            answer = (n/7);
        }else{
            answer = (n/7)+1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        D30 D = new D30();

        System.out.printf("%d 명의 사람들이 7조각으로 이루어진 피자로 최소 한 조각을 먹기위한 피자의 수는 %d개 입니다..! ", num, D.solution(num));
    }
}
