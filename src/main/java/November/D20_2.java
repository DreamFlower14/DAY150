package November;

public class D20_2 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println("함수 실행 결과 : " + Integer.toBinaryString(4));
        long end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
    }

    /** 10진수 -> 2진수 */
    public int ejin (int num){

        int answer = 0;
        StringBuilder sb = new StringBuilder("");

        while(num != 0){
            System.out.println("num : " + num);
            sb.append(num % 2);
            System.out.println("sb : " + sb + "\n");
            num = num/2;   // 4/2 = 2, 2/2 = 0
        }

        answer = Integer.parseInt(sb.reverse().toString());



        return answer;
    }
}
