package January;

import java.util.HashMap;

public class D10 {
    public static void main(String[] args) {
        // 프로그래머스 모스부호 (1) [+1]
        // 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
        // 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.

        D10 D = new D10();
        System.out.print(D.solution(".... . .-.. .-.. ---"));
    }

    public String solution(String letter) {
        String answer = "";

        String morse = ".- a -... b -.-. c -.. d . e ..-. f --. g .... h .. i .--- j -.- k .-.. l -- m -. n --- o .--. p --.- q .-. r ... s - t ..- u ...- v .-- w -..- x -.-- y --.. z";

        String[] mr = morse.split(" ");
        String[] le = letter.split(" ");

        for (int i = 0; i < le.length; i++) {
            for (int j = 0; j < mr.length; j += 2) {    // 10
                if (le[i].equals(mr[j])) {
                    answer += mr[j+1];
                }
            }
        }

        return answer;
    }
}