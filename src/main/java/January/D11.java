package January;

public class D11 {
    public static void main(String[] args) {
        // 프로그래머스 구슬을 나누는 경우의 수 [+8]
        // 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다.
        // 머쓱이가 갖고 있는 구슬의 개수 balls 와 친구들에게 나누어 줄 구슬 개수 share 이 매개변수로 주어질 때,
        // balls 개의 구슬 중 share 개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.

        D11 D = new D11();
        System.out.print(D.solution(30, 1));
    }

    public int solution(int balls, int share) {

        int mo = share > balls - share ? share + 1 : balls - share + 1; // 분자쪽에 넣어줄 숫자들은 약분을 할 때 더 큰 쪽의 펙토리얼로 약분하는것이 좋기 때문에 분모의 더 큰 펙토리얼로 미리 약분해준다.
        int mo_len = Math.min(share, balls - share);

        System.out.println("mo : " + mo);

        int[] a = new int[balls - mo + 1];   // 분자 배열
        int[] b = new int[mo_len];   // 분모 배열

        for (int i = 0; i < a.length; i++) {    // a 배열에 분자 넣기 balls! -> 1부터 balls 까지 곱하기
            a[i] = mo;
            System.out.println("a[" + i + "] = " + a[i]);
            mo++;
        }

        System.out.println();

        for (int i = 0; i < b.length; i++) {    // b 배열에 분모 넣기 share! -> 1부터 share 까지 곱하기
            b[i] = i + 1;
            System.out.println("b[" + i + "] = " + b[i]);
        }

        for (int i = 0; i < a.length; i++) {    // 분자를 분모로 약분하는 2중 for 문
            for (int j = 0; j <b.length; j++) {
                if (b[j] != 1 && a[i] % b[j] == 0) {  // 분자를 분모가 나눠서 떨어질 때 약분을 할 수 있기 때문에 조건을 확인한다.
                    System.out.println("a[" + i + "] = " + a[i] + " b[" + j + "] = " + b[j]);
                    a[i] = a[i] / b[j]; // 분자를 분모로 나누기
                    b[j] = 1;   // 분모는 1이 된다.
                    System.out.println("a[" + i + "] = " + a[i] + " b[" + j + "] = " + b[j]);
                    System.out.println();
                }
            }
        }

        long all_a = 1;
        long all_b = 1;

        for (int j : a) {    // a! a 다 곱하기
            all_a *= j;
            System.out.println("all_a : " + all_a);
        }

        for (int j : b) {
            all_b *= j;
            System.out.println("all_b : " + all_b);
        }

        return (int) (all_a/all_b);
    }
}