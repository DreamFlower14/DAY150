package September;

import java.util.Scanner;

public class D27 {
    public static void main(String[] args) {
        // CodeUp 2721 : 순환배열
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine(); // 첫 번째로 들어온 단어를 문자열에 담는다
        String b = scan.nextLine(); // 두 번째로 들어온 단어를 문자열에 담는다
        String c = scan.nextLine(); // 세 번째로 들어온 단어를 문자열에 담는다

        String[] aa = a.split(""); // 문자열에 담은 문자를 split으로 잘라서 배열 aa에 넣는다
        String[] bb = b.split("");
        String[] cc = c.split("");

        if(
            (aa[a.length()-1].equals(bb[0])) // 배열 aa의 끝 인덱스와 bb1의 첫 인덱스가 같고
                        &
            (bb[b.length()-1].equals(cc[0])) // 배열 bb2의 끝 인덱스와 cc의 첫 인덱스가 같고
                        &
            (cc[c.length()-1].equals(aa[0])) // 배열 cc의 끝 인덱스와 aa의 첫 인덱스가 같으면
        )
        {
            System.out.println("good"); // good을 출력한다.
        }else {
            System.out.println("bad"); // 아니면 bad를 출력한다.
        }
    }
}
