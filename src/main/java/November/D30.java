package November;

public class D30 {
    public static void main(String[] args) {
        // 프로그래머스 올바른 괄호
        D30 D = new D30();
        System.out.print(D.solution());
    }
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");

        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < str[i].length(); j++){
                str[i].charAt(j) % 2 == 0 ? answer += str[i].charAt(j).Charactor.to : str[i].charAt(j).lower()
            }
        }
        return answer;
    }
}
