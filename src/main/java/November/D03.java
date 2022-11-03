package November;

public class D03 {
    public static void main(String[] args) {
        D03 D = new D03();

        int[] num_list = {1,2,3,4,5};
        for (int i = 0; i < num_list.length; i++) {
            System.out.println("원본 배열 "+ i + "번째 인덱스 값 : " + + (num_list)[i]);;
        }

        for (int i = 0; i < num_list.length; i++) {
            System.out.println("거꾸로 만든 배열 "+ i + "번째 인덱스 값 : " + D.solution(num_list)[i]);
        }
    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[num_list.length-(i+1)];
        }
        return answer;
    }
}