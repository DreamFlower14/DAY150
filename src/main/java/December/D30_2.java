package December;

public class D30_2 {
    public static void main(String[] args) {
        // 프로그래머스 옷가게 할인 받기 [+7]
        // 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
        // 구매한 옷의 가격 price 가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.

        D30_2 D = new D30_2();
        System.out.print(D.solution(4545454));
    }

    public int solution(int price) {
        int answer = 0;
        if ( price >= 500000 ){
            return (int) (price * 0.8);
        }else if ( price >= 300000 ){
            return (int) (price * 0.9);
        }else if ( price >= 100000 ){
            return (int) (price * 0.95);
        }else {
            return price;
        }
    }
}