package January;

public class D05_2 {
    public static void main(String[] args) {
        // 프로그래머스 외계행성의 나이 [+1]
        // 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
        // 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
        // a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
        // 나이 age 가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return 하도록 solution 함수를 완성해주세요.


        D05_2 D = new D05_2();
        System.out.print(D.solution(123));
    }

    public String solution(int age) {
        String answer = "";
        int hundred = 97 + age / 100;   // 1
        int ten = 97 + (age / 10) % 10;   // 2
        int one = 97 + age % 10;    // 3

        if (age / 1000 == 1) {   // age 가 1000일 때
            answer = "baaa";
        } else if (age > 99) {
            answer += (char) hundred;
            answer += (char) ten;
            answer += (char) one;

            System.out.println(answer);
        } else if ( age > 9){
            answer += (char) ten;
            answer += (char) one;
        } else {
            answer += (char) one;
        }
        return answer;
    }
}