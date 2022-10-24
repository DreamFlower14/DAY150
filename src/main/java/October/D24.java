package October;

public class D24 {
    public static void main(String[] args) {
        int[] sh = {1, 2, 3, 4, 5};

        int[] sh2 = solution(sh);

        System.out.println(sh2[0]);
        System.out.println(sh2[1]);
    }

    public static int[] solution(int[] num_list) {
        int[] answer = {0,0};

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0 ){
                answer[0] += 1;
            }else{
                answer[1] += 1;
            }
        }
        return answer;
    }
}
