package January;

public class D20 {
    public static void main(String[] args) {
        // 프로그래머스 합성수 찾기 [ +1 ]

        D20 D = new D20();
        System.out.print(D.solution(10));
    }

    public int solution(int n) {
        int answer = 0;
        int cnt = 0;

        for(int i = 4; i <= n; i++){
            cnt = 0;
            for(int j = 1; j <= i; j++){
                if( i % j == 0 ){   // 약수면 cnt 를 하나 올린다.
                    cnt++;
                    System.out.println("i : " + i + " j : " + j);
                }

            }
            if(cnt >= 3){   // 약수의 개수가 3개 이상이면 answer 를 하나 올린다.
                answer++;
            }
        }
        return answer;
    }
}