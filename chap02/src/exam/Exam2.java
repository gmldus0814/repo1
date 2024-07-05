package exam;

import java.util.Scanner;

public class Exam2 {
    /*
        전원
        볼륨 up/down 0~10
        >> 볼륨의 범위를 벗어나지 못하게 해주세요
        채널 up/down/직접입력
        정보보기 : 현재 전원상태, 볼륨, 채널 정보 출력
     */

    static int volumn = 0;
    static int channel = 0;
    static String onoff = "off";

    static void volumn(String updown) {
        if (updown.equals("up")) {
            if(volumn>10) {
                System.out.println("더이상 올릴 수 없습니다.");
            }
            volumn++;
        }
        else {
            if(volumn<0) {
                System.out.println("더이상 내릴 수 없습니다.");
            }
            volumn--;
        }
    }

    static void channel(String updown) {
        if (updown.equals("up")) {
            channel++;
        }
        else if(updown.equals("down")) {
            channel--;
        }
        else {
            int re = Integer.parseInt(updown);
            channel = re;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("리모콘🕹️");
        System.out.println("전원 버튼: on / off");
        onoff = sc.next();

        while (onoff.equals("on")) {

            System.out.println("볼륨 조절: 0 / 채널 조절: 1 / 현재 정보: 2 / 종료: off");
            String choice = sc.next();

            if (choice.equals("0")) {
                System.out.println("볼륨 up/down, 0~10 현재 볼륨: "+volumn);
                String bolInput = sc.next();
                volumn(bolInput);
                System.out.println(volumn);
            }
            else if(choice.equals("1")) {
                System.out.println("채널 up/down/직접입력 현재 채널: "+channel);
                String chalInput = sc.next();
                channel(chalInput);
                System.out.println(channel);
            }
            else if(choice.equals("2")) {
                System.out.println("현재 볼륨: "+volumn);
                System.out.println("현재 채널: "+channel);
                System.out.println("현재 전원상태: "+onoff);
            }
            else if(choice.equals("off")) {
                onoff = "off";
            }
        }
    }
}