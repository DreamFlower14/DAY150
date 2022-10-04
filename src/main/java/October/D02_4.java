package October;

public class D02_4 {
    public static void main(String[] args) {
        // 백준 문자열 뒤집기 
        // Stringbuffer 사용
    }

    public String solution(String my_string) {
        String answer = "";

        StringBuffer sb = new StringBuffer(my_string);

        answer = sb.reverse().toString();

        return answer;
    }
}
