package December;

public class D23_2 {
    public static void main(String[] args) {
        // 프로그래머스 치킨 쿠폰
        // 프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다. 쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고,서비스 치킨에도 쿠폰이 발급됩니다.
        // 시켜먹은 치킨의 수 chicken 이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return 하도록 solution 함수를 완성해주세요.

        D23_2 D = new D23_2();
        System.out.println(D.solution(1081));
    }

    public int solution(int chicken) {
        int answer = 0; // 최종 서비스 치킨의 수
        int service_chicken = 1; // 서비스 치킨 수
        int left_coupon = 0; // 잔여쿠폰의 개수

        while(service_chicken > 0){
            System.out.printf("%d 마리를 주문하면 쿠폰이 %d장 발급되므로 서비스 치킨 %d 마리를 주문할 수 있습니다. 그리고 쿠폰이 %d장 남습니다. \n", chicken, chicken, chicken/10, chicken%10);
            service_chicken = chicken/10;       // 1081 -> 108       108 -> 10       10 -> 1        20 -> 2
            left_coupon += chicken%10;          // 1081 -> 1         108 -> 8        10 -> 0

            System.out.println("서비스 치킨 : " + service_chicken);
            System.out.println("잔여 쿠폰 : " + left_coupon);

            if (left_coupon > 9){   // 잔여 쿠폰의 개수가 10개가 넘어가면 서비스 치킨을 하나 더 시킴
                System.out.println("잔여 쿠폰의 개수가 10개가 넘어서 서비스 치킨 한마리 더 시켰습니다 ");
                service_chicken++;   // 최종 서비스 치킨 수 ++
                left_coupon -= 10;
            }

            chicken = service_chicken;
            answer += service_chicken;

        }
        return answer;
    }
}