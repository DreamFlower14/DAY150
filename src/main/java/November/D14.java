package November;

public class D14 {
    public static void main(String[] args) {
        D14 D = new D14();

        int[] hi = D.solution(12345);
    }
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int[] answer = new int[num.length()];
        int cnt = 0;

        for (int i = num.length()-1; i >= 0; i--) {
            answer[cnt] = Integer.parseInt(String.valueOf(num.charAt(i)));
            System.out.println(answer[cnt]);
            cnt++;
        }
        return answer;
    }
}