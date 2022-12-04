package December;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class D04 {
    public static void main(String[] args) {
        D04 D = new D04();
        System.out.print(D.solution("asDJsjdAS"));

    }
    public String solution(String str){
        return Stream.of(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }
}