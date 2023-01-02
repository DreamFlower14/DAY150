package January;

public class D02_2 {
    public static void main(String[] args) {
        // 프로그래머스 

        D02_2 D = new D02_2();
        System.out.print(D.solution("hi",2));
    }
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }

}