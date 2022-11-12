package November;

public class D12 {
    public static void main(String[] args) {
        D12 D = new D12();

        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        System.out.print("모든 값의 합은 "+D.solution(absolutes,signs) + " 입니다!");

    }
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++){
            if( signs[i] == true){
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}