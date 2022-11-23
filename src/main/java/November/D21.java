package November;

import java.util.Arrays;

public class D21 {
    public static void main(String[] args) {
        D21 D = new D21();
//        System.out.print(D.solution());

    }
    public String solution(String s) {
        String answer = "";

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);

        return answer;
    }

}