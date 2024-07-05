package exam;

import java.util.Random;
import java.util.Scanner;

public class Num {

    Random rd = new Random();
    int count = 0;
    int random = rd.nextInt(10); //0~10
    int 실행(int result) {

        if(result > random) {
            count ++;
            System.out.println("DOWN (시도횟수: "+count+")");
        }
        else if(result < random) {
            count ++;
            System.out.println("UP (시도횟수: "+count+")");
        }
        else {
            System.out.println("정답 (시도횟수: "+count+")");
            return result;
        }
        return 0;
    }


}
