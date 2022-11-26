package November;

import java.util.regex.Pattern;

public class D26 {
    public static void main(String[] args) {
        D26 D = new D26();
        System.out.print(D.solution("1234"));

    }

    public boolean solution(String s) {
        return
                (s.length() == 4 || s.length() == 6)
                        &&
                s.contains("[a-zA-Z]");
    }
}