package November;

public class D15 {
    public static void main(String[] args) {
        D15 D = new D15();
        System.out.print(D.solution(5,3));

    }
    public long solution(int a, int b) {
        long answer = 0;
        if(a < b){
            for(int i = a; i <= b; i++){
                answer += i;
                System.out.println( "i : " + i + " answer : "+ answer);
            }
        }else{
            for(int i = b; i <= a; i++){
                answer += i;
                System.out.println( "i : " + i + " answer : "+ answer);
            }
        }
        return answer;
    }
}