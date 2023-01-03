package January;

public class D02_2 {
    public static void main(String[] args) {
        // 프로그래머스 문자 반복 출력하기 [+3]
        // 문자열 my_string과 정수 n이 매개변수로 주어질 때,
        // my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.

        D02_2 D = new D02_2();
        System.out.print(D.solution("hi",2));
    }
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }

}