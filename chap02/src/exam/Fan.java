package exam;

public class Fan {

    String 선풍기 = "off";
    String 세기 = "약풍";

    void 전원on(String 세기) {
        this.세기 = 세기;
        선풍기 = "on";
        System.out.println(선풍기);
        풍량(세기);
    }

    void 전원off() {
        선풍기 = "off";
        System.out.println(선풍기);
        System.out.println();
    }

    void 풍량(String 세기) {
        if (세기.equals("약풍")) {
            System.out.println("약풍on");
        }
        else {
            System.out.println("강풍on");
        }

    }

}
