package December;

public class D21 {
    public static void main(String[] args) {
        D21 D = new D21();
        String[] strlist = {"We", "are", "the", "world!"};
        int[] num = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            num[i] = D.solution(strlist)[i];
            System.out.println(strlist[i]);
            System.out.println(num[i]);
        }
    }
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }

}