package October;

class D02_3 {
    public static void main(String[] args) {
        // 프로그래머스 나눈 값 정수로 반환하기
        D02_3 D = new D02_3();
        System.out.println(D.solution(3,2));

    }
    public int solution(int num1, int num2) {
        float two = (float)num1 / num2;
        System.out.println(two);
        int answer = (int)(two*1000);

        return answer;
    }
}
