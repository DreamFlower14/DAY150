package February;

public class D14 {
    public static void main(String[] args) {
        // 프로그래머스 문자열안에 문자열
        // 문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

        D14 D = new D14();
        System.out.print(D.solution("ab6CDE443fgh22iJKlmn1o","6CD"));
    }

    public int solution(String str1, String str2) {
        return str1.contains(str2) == true ? 1:2;
    }
}