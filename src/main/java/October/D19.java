package October;
import java.lang.Math.*;

public class D19 {
    public static void main(String[] args) {
        System.out.println(solution(11));
    }

    public static boolean solution(int x) {
        boolean answer = false;
        int res = x;
        int result = 0;

        for(int i = 4; i >= 0; i--){
            result += x/(int)Math.pow(10,i);   // 10000으로 나누면 소수점값만 나옴 (int)로 + 0 , 나눌 몫이 있는 값 나오면 더해주기
            x -= (x/(int)Math.pow(10,i))*(int)Math.pow(10,i);     // 더해준 만큼 빼주기
            System.out.println("i : " + Math.pow(10,i));
            System.out.println("x 나눈 값 : " + (x/(int)Math.pow(10,i))*(int)Math.pow(10,i));
            System.out.println("x : " + x);
            System.out.println("result : " + result);
        }


        if(res % result == 0){
            answer =true;
        }

        return answer;
    }
}
