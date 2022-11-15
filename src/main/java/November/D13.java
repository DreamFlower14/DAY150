package November;

public class D13 {
    public static void main(String[] args) {
        D13 D = new D13();
        System.out.print(D.solution("abcde"));

    }
    public String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0){   // 짝수
            int index = s.length()/2 -1;
            answer += s.charAt(index);
            answer += s.charAt(index+1);
            System.out.println(answer);
        }else{  // 홀수
            int index = s.length()/2;
            answer += s.charAt(index);
            System.out.println(answer);
        }

        return answer;
    }
}
