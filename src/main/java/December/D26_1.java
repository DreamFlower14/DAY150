package December;

import java.util.Scanner;

/**
 * 날짜 : 2022-12-26
 * 시간 : 오후 11:35
 */
public class D26_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        D26_1 D = new D26_1();

        String my_string = "abcdef";
        String letter = "f";

        System.out.print(D.solution(my_string,letter));
    }

    public String solution(String my_string, String letter) {

        return my_string.replace(letter, "");
    }
}
