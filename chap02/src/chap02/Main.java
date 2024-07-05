package chap02;

public class Main {
    public static void main(String[] args) {


//      i=1로 이중 for문 안에서 0<1이 되므로 1번 돌고 다음으로 넘어가고
//      i=2가 됨. 그럼 이중 for문 안에서 0<2로 다시 for문이 돌기 시작함. 그래서 별 2개가 출력되는거임
//      이렇게 점점 늘어 나짐

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();


        for (int i = 1; i < 8; i += 2) {
            for (int j = 7; j > i; j -= 2) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }


        System.out.println();


        for (int i = 1; i < 8; i += 2) {
            for (int j = 7; j > i; j -= 2) {
                System.out.print("^");
            }

            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }

            for (int j = 7; j > i; j -= 2) {
                System.out.print("^");
            }

            System.out.println();
        }

        System.out.println();


//      구구단

        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(j + " * " + i + " = " + j * i);
                System.out.print("    ");
            }
            System.out.println();
        }


        System.out.println();


        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(j + " * " + i + " = " + j * i);
                System.out.print("    ");
                if(j%3==1) {
                    System.out.println();
                }
            }
            System.out.println();
        }


        // 1단계
        // 주사위 2개로 굴려서 나올 수 있는 모든 조합을 출력

        for(int i=1; i<7; i++) {
            for(int j=1; j<7; j++) {
                System.out.println("주사위1: "+i+"/"+"주사위2: "+j);
            }
        }


        // 2단계
        // 합 별로 나올 수 있는 조합
        // 합이 2 : [1,1]
        // 합이 3 : [1,2] [2,1]


        int result = 2;
        while (result <= 12) {
            System.out.print(result+" = ");
            for(int i=1; i<7; i++) {
                for(int j=1; j<7; j++) {
                    if (i+j == result) {
                        System.out.print("["+i+", "+j+"]");
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            result ++;
        }

    }
}