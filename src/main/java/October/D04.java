package October;

import java.util.Scanner;

public class D04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();  // 입력 받은 n번째 수
        int i = 1;
        int u; // 분자
        int d; // 분모

        while(true){
            if ((num - i) < 1){
                //i++;
                break;
            }
            num -= i;
            i++;
        }

        if ((i % 2) != 0){  // 홀수 일 때
            u = i - (num - 1);
            d = num;
        }else {             // 짝수 일 때
            u = num;
            d = i - (num - 1);
        }

        System.out.println( u + "/" + d);
    }
}