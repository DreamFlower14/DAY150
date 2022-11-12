package November;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class D11_2 {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int a = A.length;

        Arrays.sort(A);
        Integer[] tmp = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Comparator.reverseOrder());

        // Iterator<Arrays> ai = Arrays.stream(A).iterator();

        // while(A.hasNext()){



        return answer;
    }
}
