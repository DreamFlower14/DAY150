package October;

import java.util.Scanner;

/**
 * 날짜 : 2022-10-07
 * 시간 : 오후 12:59
 */
public class D07 {
    public static void main(String[] args) {


    }

    public int solution(int angle){

        int answer = 0;

        if( (angle > 0 ) && (angle < 90) ){
            answer = 1;
        }else if( angle == 90){
            answer = 2;
        }else if((angle > 90 ) && (angle < 180) ) {
            answer = 3;
        }else if( angle == 180) {
            answer = 4;
        }
        return answer;
    }
}
