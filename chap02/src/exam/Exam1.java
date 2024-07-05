package exam;

import java.util.Scanner;

public class Exam1 {

    static void operation(int a, String op, int b) {
        if (op.equals("+")) {
            System.out.println(a +" "+ op+" " + b + " = "+ (a+b));
        }
        else if(op.equals("-")) {
            System.out.println(a +" "+ op+" " + b + " = "+ (a-b));
        }
        else if(op.equals("*")) {
            System.out.println(a +" "+ op+" " + b + " = "+ (a*b));
        }
        else if(op.equals("/")) {
            System.out.println(a +" "+ op+" " + b + " = "+ (a/b));
        }
        else if(op.equals("%")) {
            System.out.println(a +" "+ op+" " + b + " = "+ (a%b));
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        String op = sc.next();
        int num2 = sc.nextInt();
        operation(num1, op, num2);

    }

}