package October;

public class D25 {
    public static void main(String[] args) {
        D25 D = new D25();
        System.out.println(D.solution(10,3));
    }
    public int solution(int n, int k) {
        int answer = 0;
        int service = (n/10)*2000;

        answer = (12000*n) + (2000*k) - service;

        return answer;
    }
}
