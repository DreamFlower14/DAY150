package December;

public class D30 {
    public static void main(String[] args) {
        // 프로그래머스 피자 나워 먹기 (2) [+2]
        // 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
        // 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
        // n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.

        D30 D = new D30();
        D.solution(10);
    }

    public void solution(int n) {
        int answer = 1;
        while(6*answer%n!=0){
            answer++;
        }
        System.out.println(n + "명이 모두 같은 양을 먹기 위해 " + answer + "판을 시켜야 피자가 " + 6*answer + "조각으로 모두 " + 6*answer/n + "조각씩 먹을 수 있습니다.");
    }
}