package December;

public class D26 {
    public static void main(String[] args) {
        // 프로그래머스 
        D26 D = new D26();
        String a = "hello";
        String b = "ohell";
        System.out.print(D.solution(a,b));
    }

    public int solution(String A, String B) {
        StringBuilder sb = new StringBuilder(A);    // 객체 선언하는 건데 할 때 바로 sb 에다가 A 넣어주기 "hello"
        int num = sb.length();

        if (A.equals(B)) return 0;

        for (int i = 0; i < num - 1; i++) {
            if (sb.insert(0, sb.charAt(num - 1)).deleteCharAt(num).toString().equals(B)) {
                return i + 1;
            }
        }
        return -1;
    }


    public int s1(String A, String B){
        int len = A.length();
        if (B.equals(A)) return 0;

        for (int j = 0; j < len; j++) {

            String str = String.valueOf(A.charAt(len-1));   // 제일 뒤만 가진 문자열 생성

            for (int i = 1; i < len; i++) {
                str += A.charAt(i-1);   // 방금 만든 문자열 뒤에 제일 앞부터 제일 뒤 -1까지 붙여주기
            }

            if(B.equals(str)){
                return j+1;
            } else {
                A = str;
                str = "";
            }
        }
        return -1;
    }
}