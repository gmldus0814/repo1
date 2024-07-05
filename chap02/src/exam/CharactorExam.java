package exam;

import java.util.Scanner;

public class CharactorExam {
    public static void main(String[] args) {

        Charactor 희연 = new Charactor();
        Charactor 수찬 = new Charactor();

        Scanner sc = new Scanner(System.in);

        System.out.println("앗! 야생의 수찬이가 나타났다!");

        while(true) {

            int 희연방어력 = 희연.getDefensive();
            int 수찬방어력 = 수찬.getDefensive();

            System.out.println("---------------------------------");
            System.out.println("희연HP | "+희연.getStrength());
            System.out.println("희연방어력 | "+희연방어력);
            System.out.println("수찬HP | " + 수찬.getStrength());
            System.out.println("수찬방어력 | "+수찬방어력);

            System.out.println("---------------------------------");
            System.out.println("희연의 Turn | 싸운다: 1 / 회복한다: 2");
            System.out.println("---------------------------------");


            int 희연turn = sc.nextInt();
            if(희연turn == 1) {
                int attack =  희연.attack();
                attack -= 수찬방어력;
                수찬.strength -= attack;

                System.out.println("희연의 주먹파이팅!!");
                System.out.println("수찬의 HP가 " + attack+"만큼 까였다!");
                System.out.println("수찬의 남은체력: " + 수찬.getStrength());
            }
            else if(희연turn == 2) {
                int heal = 희연.heal();
                if(희연.strength + heal >= 100) {
                    희연.strength = 100;
                }
                else {
                    희연.strength += heal;
                }
                System.out.println("희연이 회복 물약을 사용했다!");
                System.out.println("희연의 HP가" + heal+"만큼 회복되었다!");
                System.out.println("희연의 남은체력: " + 희연.getStrength());
            }


            if(수찬.getStrength() <= 0) {
                System.out.println("수찬이가 힘을 잃었다.");
                System.out.println("희연이 승!");
                break;
            }


            System.out.println("---------------------------------");
            System.out.println("수찬의 Turn | 싸운다: 1 / 회복한다: 2");
            System.out.println("---------------------------------");


            int 수찬turn = sc.nextInt();
            if(수찬turn == 1) {
                int attack =  수찬.attack();
                attack -= 희연방어력;
                희연.strength -= attack;
                System.out.println("수찬의 주먹파이팅!!");
                System.out.println("희연의 HP가" + attack+"만큼 까였다!");
            }
            else if(수찬turn == 2) {
                int heal = 수찬.heal();
                System.out.println(heal);
                if(수찬.strength + heal >= 100) {
                    수찬.strength = 100;
                }
                else {
                    수찬.strength += heal;
                }
                System.out.println("수찬이 회복 물약을 사용했다!");
                System.out.println("수찬의 HP가" + heal+"만큼 회복되었다!");
                System.out.println("수찬의 남은체력: " + 수찬.getStrength());
            }


            if(희연.getStrength() <= 0) {
                System.out.println("희연이가 힘을 잃었다.");
                System.out.println("수찬이 승!");
                break;
            }
        }


    }
}
