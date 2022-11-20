package November;

public class D20 {
    public static void main(String[] args) {
        D20 D = new D20();
        System.out.println(D.Bettersolution("01110")[0] + " " + D.Bettersolution("01110")[1]);
    }

    public int[] solution(String s) {
        int a = 0;
        int b = 0;

        while (true) {
            if (s.equals("1"))
                break;
            while (s.contains("0")) {
                s = s.replaceFirst("0", "");
                System.out.println("문자열 : " + s);
                b++;
                System.out.println("0 제거한 횟수 : " + b + "\n");
            }
            System.out.println("s의 길이 : " + s.length());
            s = Integer.toBinaryString(s.length());
            System.out.println("s로 새로 만든 문자열 : " + s);
            a++;
            System.out.println("이진변환 횟수 : " + a);
        }

        int[] answer = {a, b};
        return answer;
    }

    public int[] Bettersolution(String s) {
        int a = 0;
        int b = 0;

        while (true) {
            if (s.equals("1")) {
                System.out.println("끝");
                break;
            }

            System.out.println("s 길이 : " + s.length() + " / 0 뺀 길이 : " + s.replaceAll("0", "").length());
            b += s.length() - s.replaceAll("0", "").length();
            System.out.println("b : " + b);
            s = s.replaceAll("0", "");
            s = Integer.toBinaryString(s.length());
            System.out.println("s : " + s + "\n");
            a++;
        }

        int[] answer = {a, b};
        return answer;
    }
}