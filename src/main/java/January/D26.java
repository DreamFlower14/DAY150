package January;

public class D26 {
    public static void main(String[] args) {
        // 프로그래머스 모음 제거 [ +1 ]
        // 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
        // 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

        D26 D = new D26();
        System.out.print(D.solution("nice to meet you"));
    }

    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}