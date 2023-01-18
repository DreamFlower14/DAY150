package January;

public class D18 {
    public static void main(String[] args) {
        // 프로그래머스 공 던지기 [ +4 ]
        // 머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
        // 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
        // 친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.

        int[] num = {1, 2, 3, 4, 5, 6};

        D18 D = new D18();
        System.out.print(D.solution(num,5));
    }

    public int solution(int[] numbers, int k) {
        int answer = 1 + (k - 1) * 2;   // (k - 1) * 2 : 첫 번째는 1부터 시작이니까 2번째 던지는 사람은 1 + (2 - 1) * 2 번째 사람이다.

        if (answer > numbers.length){   // 만약 answer 가 배열의 끝자리(numbers.length)보다 커진다면 다시 처음으로 온다.
            answer = answer % numbers.length;
        }

        return answer;
    }
}