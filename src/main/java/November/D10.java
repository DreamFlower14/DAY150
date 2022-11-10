package November;

public class D10 {
    public static void main(String[] args) {
        D10 D = new D10();
        System.out.println(D.solution("01033334444"));
    }
    public String solution(String phone_number) {
        String answer = "";
        System.out.println("입력된 전화번호  : " + phone_number);

        for (int i = 0; i < phone_number.length()-4; i++) {
            answer += "*";
        }
        System.out.println("1번째 answer : " + answer);

        answer += phone_number.substring(phone_number.length()-4,phone_number.length());
        System.out.println("2번째 answer : " + answer);


        return answer;
    }
}