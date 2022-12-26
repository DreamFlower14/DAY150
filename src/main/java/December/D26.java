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
        StringBuilder sb = new StringBuilder(A);
        int num = sb.length() - 1;

        System.out.println(sb.insert(sb.charAt(0), sb.charAt(num)).deleteCharAt(num));
        for (int i = 0; i < num; i++) {
            if (sb.insert(sb.charAt(0),num).deleteCharAt(num).toString().equals(B)){
                System.out.println(sb.insert(sb.charAt(0), sb.charAt(num)).deleteCharAt(num));
                return i+1;
            }
        }
        return -1;
    }
}