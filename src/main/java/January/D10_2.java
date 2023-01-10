package January;

public class D10_2 {
    public static void main(String[] args) {
        // 프로그래머스 가위 바위 보

        D10_2 D = new D10_2();
        System.out.print(D.solution("205"));
    }

    public String solution(String rsp) {
        String answer = "";

        for (int i = 0; i < rsp.length(); i++){
            if( rsp.charAt(i) == '2'){
                answer += "0";
            }else if (rsp.charAt(i) == '0'){
                answer += "5";
            }else{
                answer += "2";
            }
        }
        return answer;
    }
}