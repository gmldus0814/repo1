package bank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int money = 0; //잔액

        Scanner sc = new Scanner(System.in);


        while(true) {

            System.out.println("메뉴 : 1.입금, 2.출금, 3.조회, 4.종료");
            int bankSystem = sc.nextInt();

            if (bankSystem == 1) {
                System.out.println("입금할 금액을 입력해주세요: ");
                int moneyInput = sc.nextInt();
                if(moneyInput < 0) {
                    System.out.println("다시 입력해주세요.");
                }
                else {
                    money += moneyInput;
                    System.out.println("입금되었습니다.");
                    System.out.println("현재 잔액: "+ money);
                    System.out.println("1. 메뉴로 돌아가기, 2. 종료");
                    int turn = sc.nextInt();
                    if(turn == 2) {
                        break;
                    }
                }
            }

            else if (bankSystem == 2) {
                System.out.println("귀하의 잔액을 확인하세요: "+money);
                System.out.println("출금할 금액을 입력해주세요: ");
                int moneyOut = sc.nextInt();
                if(moneyOut > money) {
                    System.out.println("잔액이 부족합니다.");
                }
                else {
                    money -= moneyOut;
                    System.out.println("출금되었습니다.");
                    System.out.println("잔액: "+money);
                }
            }

            else if (bankSystem == 3) {
                System.out.println("귀하의 잔액은 총 "+ money+"원 입니다.");
            }

            else if (bankSystem == 4) {
                System.out.println("은행 업무를 종료합니다.");
                break;
            }

            else {
                System.out.println("잘못된 값입니다.");
            }

        }




    }
}
