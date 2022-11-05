package November;

public class D05 {
    public static void main(String[] args) {
        D05 D = new D05();
        System.out.println(D.perfectSolution(987));

    }

    public int solution(int n) {
        int answer = 0;
        int j = 0;
        int length = (int)(Math.log10(n)+1);

        for(int i = length -1 ; i >= 0; i--){
            j = (int)(Math.pow(10,i));

            answer += n / j;
            n -= (n/j*j);
        }

        return answer;
    }
    public int perfectSolution(int n) {
        int answer = 0;

        while(n>0){
            answer += n%10;

            n = n/10;
        }

        return answer;
    }
}