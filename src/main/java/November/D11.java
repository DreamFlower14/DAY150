package November;

public class D11 {
    public static void main(String[] args) {
        D11 D = new D11();
        System.out.print(D.solution(12));

    }
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i < n; i++) {
            if ( n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}