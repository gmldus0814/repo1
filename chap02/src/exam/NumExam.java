package exam;

import java.util.Scanner;

public class NumExam {
    public static void main(String[] args) {
        Num num = new Num();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("0부터 9까지의 수를 입력하시오.");
            int result = sc.nextInt();
            int r = num.실행(result);
            if(r==result) {
                break;
            }
        }
    }
}
