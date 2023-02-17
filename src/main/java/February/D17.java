package February;

public class D17 {
    public static void main(String[] args) {
        // 프로그래머스 7의 개수 [+1]
        // 머쓱이는 행운의 숫자 7을 가장 좋아합니다.
        // 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

        int[] num = {7, 77, 17};

        D17 D = new D17();
        System.out.print(D.solution(num));
    }

    public int solution(int[] array) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }

        String seven = sb.toString();

        return seven.length() - seven.replaceAll("7","").length();
    }
}