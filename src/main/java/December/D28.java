package December;

public class D28 {
    public static void main(String[] args) {
        // 프로그래머스 분수의 덧셈
        // 첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1, 두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다.
        // 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

        D28 D = new D28();
        System.out.println(D.solution1(1,4,2,4)[0]);
    }

    public int[] solution1(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int max = 0;    // 최대 공약수
        int min = 0;   // 최소 공배수
        int big, small;

        // 분모가 같아야지 분수의 덧셈이 가능하기 때문에 분모를 같게 만들어준다.
        // 분모가 어떻게 같아져야하냐 -> 양쪽 분모의 최소 공배수로 분모를 통일해준다.
        // ※ 단 이때 분자에도 분모를 최소공배수로 만들기 위해 곱한 값을 곱해줘야 한다.
        // Ex) 1 / 2 의 분모인 2를 4로 바꾸려고 한다면 분자에도 2를 곱해줘야한다. ( 2 -> 4 는 2x2 를 해줘서 4가 돼었기 때문) ==> 2 / 4

        // 1번째 단계 : 두 분수의 분모의 최소 공배수를 찾는다. num1 - num2 의 최소 공배수 찾기
        // 두 수 중에 더 큰 수를 작은 수로 나누었을 때 나머지가 0이면 작은 수는 두 수의 최대 공약수이다. 일단 최대 공약수를 구해보고 최소 공배수도 구해보자

        // num1이 큰지 num2가 큰지에 따라 while 문을 2개를 써야할지도 모르니까 if 문에서 더 큰 수, 작은 수를 나눈다
        if (num1 > num2){
            big = num1;
            small = num2;
        }else{
            big = num2;
            small = num1;
        }

        // small 이 big 를 나눴을 때 0이 나오면 small 이 둘 사이의 최대 공약수이다.
        while (small != 0) {  //
            System.out.printf("big : %d small : %d ", big, small);
            max = big % small; // big 를 small 로 나눈 값으로 다시 small 를 나눠주는 것을 반복한다.
            big = small;
            small = max;
            System.out.println("max : " + big);
        }
        System.out.println("최대 공약수 : " + big );

        // 최대 공약수를 알게 됐다면 최소 공배수를 계산하는 방법은 쉽다.
        // 두 숫자 a,b 에 대하여 최대 공약수, 최대 공배수의 관계는
        // a x b = 두 수의 최대 공약수 x 두 수의 최소 공배수 이므르
        // ∴ 두 수의 최소 공배수 = a x b / 두 수의 최대 공약수

        min = num1 * num2 / big;
        System.out.println("최소 공배수 : " + min );

        // denum1 denum2 에 num1 과 num2 를 temp 로 만들기 위해서 곱한 값을 곱해주기
        denum1 = denum1 * num2 / big;
        denum2 = denum2 * num1 / big;
        System.out.println("denum1 : " + denum1 + " denum2 : " + denum2);

        answer[0] = denum1 + denum2;
        answer[1] = min;

        System.out.println(answer[0] + "/" + answer[1]);

        return answer;
    }

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int max = 0;    // 최대 공약수
        int big, small;

        if (num1 > num2){
            big = num1;
            small = num2;
        }else{
            big = num2;
            small = num1;
        }

        while (small != 0) {
            max = big % small;
            big = small;
            small = max;
        }

        small = num1 * num2 / big;
        denum1 = denum1 * num2 / big;
        denum2 = denum2 * num1 / big;

        int[] answer = {denum1 + denum2,small};

        return answer;
    }
}