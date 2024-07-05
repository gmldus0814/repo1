package exam;

public class Charactor {
    /*
    class charactor
    체력 100에서 시작
    방어력: 특정 범위 안에서 random
    메소드
    attack (% 또는 수치)
    heal   (% 또는 수치)

    내성이 있어서 회복 수치가 점점 줄어들 수도 있다
    남은 체력을 출력
    defence : 방어력을 제외한 상대의 attack 수치를 체력에서 깎음

    체력이 0 이하가 되면 "사망" 출력

    main에서 두 캐릭터를 생성해서 서로 싸워라!
     */

    int strength;
    int defensive;

    Charactor() {
        strength = 100;
    }



    public int getStrength() {
        return strength;
    }

    public int getDefensive() {
        defensive = (int) (Math.random()*10)+1;
        return defensive;
    }

    int attack() {
        int attack = (int) (Math.random()* 41) + 10;
        if(attack>defensive) {
            System.out.println("공격력: "+attack);
            return attack;
        }
        else {
            return 1;
        }
    }

    int heal() {
        int heal = (int) (Math.random()* 21) + 10;
        return heal;
    }


}

