package November;

public class D25 {
    public static void main(String[] args) {
        // 프로그래머스 정수 제곱근 판별
        D25 D = new D25();
        System.out.print(D.solution(121));


    }
    public long solution(long n) {
        long answer = 0;
        return answer = (Math.sqrt(n) - (int)Math.sqrt(n) == 0) && (n > 0) ? (long)(Math.pow((Math.sqrt(n)+1),2)) : -1 ;
    }
}