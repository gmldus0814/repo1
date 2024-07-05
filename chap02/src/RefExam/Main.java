package RefExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        자리 예약
//        자리가 10개 있는 소극장 예약 시스템
//        1~10번까지 번호의 자리가 있음
//        예약할 자리는? 하고 입력 받음
//        예약이 가능하면 "예약이 완료되었습니다."
//        예약이 불가능하면 "이미 예약되었습니다."
//        모든 자리의 예약 가능 여부 출력
//        예약 가능한 자리만 출력


        int[] seat = new int[10];
        String[] reservation = new String[seat.length];


        while (true) {
            System.out.println();
            System.out.println("----------소극장---------");
            System.out.println("예약 가능한 자리: O / 예약 불가능한 자리: X");

            for (int i = 0; i < seat.length; i++) {
                if (seat[i] == 0) {
                    reservation[i] = "O";
                } else {
                    reservation[i] = "X";
                }
            }
            System.out.print("| ");
            for (int i = 0; i < seat.length; i++) {
                System.out.print(i + 1 + " : " + reservation[i] + " | ");
            }


            System.out.println();


            System.out.println("예약할 자리의 번호를 입력해주세요(1~10) / 종료: 0");
            Scanner sc = new Scanner(System.in);
            int moveInput = sc.nextInt();


            if (moveInput == 0) {
                System.out.println("종료됩니다.");
                break;
            }


            if (seat[moveInput - 1] == 0) {
                System.out.println("예약되었습니다.");
                seat[moveInput - 1] = 1;
            } else if (seat[moveInput - 1] == 1) {
                System.out.println("예약이 완료된 자리입니다.");
                System.out.println("예약이 가능한 자리만 조회하고 싶으시다면 'Y'를 입력해주세요.");
                String seatOk = sc.next();

                if (seatOk.equals("Y")) {
                    for (int i = 0; i < seat.length; i++) {
                        if (reservation[i].equals("O")) {
                            System.out.print(i + 1 + " : " + reservation[i] + " | ");
                        }
                    }
                }


            } else {
                System.out.println("1~10의 자리만 입력해주세요.");
            }


        }


//        임시비밀번호 8자리 만들기
//        1. 모두다 숫자로
//        2. 모두다 소문자로(char ascii)
//        3. 숫자 2개이상, 대문자 1개 이상, 소문자 1개이상 조합


        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int rd = random.nextInt(10) + 1;
            System.out.print(rd);
        }

        System.out.println();

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'

        int targetStringLength = 8;

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        System.out.println(generatedString);


        // 8자리 문자 배열 생성
        char[] randomChars = new char[8];

        // 최소 요구 사항 충족: 2개의 숫자, 1개의 대문자, 1개의 소문자
        randomChars[0] = (char) ('0' + random.nextInt(10)); // 숫자
        randomChars[1] = (char) ('0' + random.nextInt(10)); // 숫자
        randomChars[2] = (char) ('A' + random.nextInt(26)); // 대문자
        randomChars[3] = (char) ('a' + random.nextInt(26)); // 소문자

        // 나머지 4개의 문자: 랜덤하게 선택
        for (int i = 4; i < randomChars.length; i++) {
            int choice = random.nextInt(3);
            if (choice == 0) {
                // 숫자 추가
                randomChars[i] = (char) ('0' + random.nextInt(10));
            } else if (choice == 1) {
                // 대문자 추가
                randomChars[i] = (char) ('A' + random.nextInt(26));
            } else {
                // 소문자 추가
                randomChars[i] = (char) ('a' + random.nextInt(26));
            }
        }

        // 배열 섞기
        for (int i = 0; i < randomChars.length; i++) {
            int randomIndex = random.nextInt(randomChars.length);
            char temp = randomChars[i];
            randomChars[i] = randomChars[randomIndex];
            randomChars[randomIndex] = temp;
        }

        // 최종 문자열 생성
        String result = new String(randomChars);
        System.out.println(result);


//    배열 뒤집기 {1,5,2,4} -> {4,2,5,1}
//     첫번째 자리에 0넣기
//       회전하는 느낌 -> {4.1.5.2}

        int[] result2 = new int[]{1,5,2,4};

        int[] result3 = new int[result2.length];

        for(int i=result2.length-1; i>=0; i--) {
            result3[i] = result2[i];
            System.out.print(result3[i]+" ");
        }

        System.out.println();

        int[] result4 = new int[result2.length+1];

        result4[0] = 0;
        System.out.print(result4[0]);
        for (int i=0; i<result2.length; i++) {
            result4[i+1] = result2[i];
            System.out.print(" "+result4[i+1]);
        }


        System.out.println();


        int[] result5 = new int[result2.length];

        result5[0] = result2[result2.length-1];
        System.out.print(result5[0]);
        for (int i=1; i<result2.length; i++ ){
            result5[i] = result2[i-1];
            System.out.print(" "+result5[i]);
        }



    }




}
