package January;

public class D20 {
    public static void main(String[] args) {
        // 프로그래머스 합성수 찾기

        D20 D = new D20();
        System.out.print(D.solution(10));
    }

    public int solution(int n) {
        int answer = 0;
        int cnt = 0;

        for(int i = 2; i <= n; i++){
            cnt = 0;
            for(int j = 1; j < i; j++){
                if( i % j == 0 ){
                    cnt++;
                }

            }
            if(cnt >= 3){
                answer++;
            }
        }
        return answer;
    }
}