package November;

public class D29 {
    public static void main(String[] args) {
        // 프로그래머스 올바른 괄호
        D29 D = new D29();
        System.out.print(D.solution("(()("));

    }
    boolean solution(String s) {
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                cnt++;
            }else{
                cnt--;
                if(cnt < 0)
                    return false;
            }
        }
        if(cnt == 0){return true;}else{return false;}
    }
}