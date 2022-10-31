package October;

import java.util.Scanner;

public class D31 {
    public int solution(int slice, int n) {
        int answer = 0;

        if (n % slice == 0) {
            answer = n / slice;
        } else {
            answer = n / slice + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("피자를 먹을 사람의 수는? : ");
        int num = scan.nextInt();

        System.out.println("피자는 몇 조각인가요? : ");
        int slice = scan.nextInt();



        D30 D = new D30();

        System.out.printf("%d 명의 사람들이 %d 조각으로 이루어진 피자로 최소 한 조각을 먹기위한 피자의 수는 %d개 입니다..! ", num, slice, D.solution(num));
    }
}