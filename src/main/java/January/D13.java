package January;

public class D13 {
    public static void main(String[] args) {
        // 프로그래머스 2차원으로 만들기 [+1]
        // 정수 배열 num_list와 정수 n이 매개변수로 주어집니다. num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
        //num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다.
        // 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
        D13 D = new D13();

        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        System.out.print(D.solution(num_list,3));

    }

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        System.out.println(num_list.length);
        System.out.println(num_list.length/n);

        int num = 0;

        for(int i = 0; i < num_list.length/n; i++){
            for(int j = 0; j < n; j++){
                answer[i][j] = num_list[num];
                num++;
            }
        }    return answer;
    }
}