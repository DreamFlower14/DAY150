package October;

import java.util.Scanner;

public class D02 {
    public static void main(String[] args) {
        // BaekJoon 2941
        Scanner scan = new Scanner(System.in);
        String c = scan.nextLine();

        c = c.replaceAll("c="," ");
        c = c.replaceAll("c-"," ");
        c = c.replaceAll("dz="," ");
        c = c.replaceAll("d-"," ");
        c = c.replaceAll("lj"," ");
        c = c.replaceAll("nj"," ");
        c = c.replaceAll("s="," ");
        c = c.replaceAll("z="," ");

        System.out.println(c.length());
    }
}
