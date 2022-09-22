package September;

import java.util.Scanner;

public class D22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String love = scan.nextLine();

        String[] list = love.split("");

        int cnt = 0;

        for (int i = 0; i < love.length()-3; i++){
            if (    (list[i].equals("l"))&
                    (list[i+1].equals("o"))&
                    (list[i+2].equals("v"))&
                    (list[i+3].equals("e"))
            ) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}