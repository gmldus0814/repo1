package coffee;

import java.util.*;
//강희연

public class exam {

    //    총 장바구니
    public static void total_order(Map<String, List<String[]>> map, String key, String[] optionArray) {
        // 키가 없으면 새로운 리스트를 추가
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        // 옵션 배열을 리스트에 추가
        map.get(key).add(optionArray);
    }

    public static String[] getOptions(Scanner sc, String shot, String syrup) {
        String[] option_add = new String[]{"샷제외", "시럽제외"};
        while (true) {
            System.out.println("■ 추가하실 옵션을 선택하세요.");
            System.out.println("■ 0. 처음으로 1. 없음 2. 샷추가(+500원) 3. 시럽추가(+500원) 4. 샷추가+시럽추가(+1000원) 5. 종료");
            int option = sc.nextInt();
            if (option == 0) {
                return null; // 처음으로 돌아가기
            } else if (option == 1) {
                break; // 옵션 없음
            } else if (option == 2) {
                System.out.println("■ 0. 이전으로");
                System.out.println("■ 1. 샷추가(+500원)");
                int shot_add = sc.nextInt();
                if (shot_add == 0) {
                    continue;
                } else if (shot_add == 1) {
                    option_add[0] = shot;
                    break;
                }
            } else if (option == 3) {
                System.out.println("■ 0. 이전으로");
                System.out.println("■ 1. 시럽추가(+500원)");
                int syrup_add = sc.nextInt();
                if (syrup_add == 0) {
                    continue;
                } else if (syrup_add == 1) {
                    option_add[1] = syrup;
                    break;
                }
            } else if (option == 4) {
                System.out.println("■ 0. 이전으로");
                System.out.println("■ 1. 샷추가+시럽추가(+1000원)");
                int all_add = sc.nextInt();
                if (all_add == 0) {
                    continue;
                } else if (all_add == 1) {
                    option_add[0] = shot;
                    option_add[1] = syrup;
                    break;
                }
            }else if (option == 5) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            }else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        return option_add;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //주문한 총 갯수
        int count = 0;
        //주문한 총 금액
        int money = 0;

        String shot = "샷추가";
        String syrup = "시럽추가";

        Map<String, List<String[]>> order = new HashMap<>();

        while (true) {
            //아메리카노 갯수
            int americano_num = 0;
            //카페라떼 갯수
            int latte_num = 0;
            //카페라떼 갯수
            int cappuccino_num = 0;


            // 장바구니 출력
            System.out.println("■ 🧺장바구니 목록");
            for (Map.Entry<String, List<String[]>> entry : order.entrySet()) {
                String key = entry.getKey();
                int num = entry.getValue().size();

                // 음료 갯수 세기
                if (key.equals("아메리카노")) {
                    americano_num += num;
                } else if (key.equals("카페라떼")) {
                    latte_num += num;
                } else if (key.equals("카푸치노")) {
                    cappuccino_num += num;
                }

                // 출력
                System.out.println("■ 음료: " + key + " | 갯수: " + num);
                for (String[] print_options : entry.getValue()) {
                    System.out.println("■ 옵션: " + String.join(", ", print_options));
                }
            }

            System.out.println("■ 🍀총 갯수: " + count);
            System.out.println("■ 💸총 금액: " + money + "원");


            System.out.println("■ 주문하실 커피의 종류를 선택하세요.");
            System.out.println("■ 1. 아메리카노(3000원) 2. 카페라떼(3500원) 3. 카푸치노(4000원)");
            System.out.println("■ 종료를 원하신다면 C 혹은 c 를 입력해주세요.");
            String coffee_input = sc.next();


            if (coffee_input.equals("C") || coffee_input.equals("c")) {
                break;
            }
            if (coffee_input.equals("1")) {
                String[] options = getOptions(sc, shot, syrup);
                if (options == null) {
                    continue;
                }
                System.out.println("■ ☕아메리카노가 추가되었습니다.");
                total_order(order, "아메리카노", options);
                count += 1;
                money += 3000;
                if (options[0].equals(shot)) {
                    money += 500;
                }
                if (options[1].equals(syrup)) {
                    money += 500;
                }

            } else if (coffee_input.equals("2")) {
                String[] options = getOptions(sc, shot, syrup);
                if (options == null) {
                    continue;
                }
                System.out.println("■ 🥛카페라떼가 추가되었습니다.");
                total_order(order, "카페라떼", options);
                count += 1;
                money += 3500;
                if (options[0].equals(shot)) {
                    money += 500;
                }
                if (options[1].equals(syrup)) {
                    money += 500;
                }

            } else if (coffee_input.equals("3")) {
                String[] options = getOptions(sc, shot, syrup);
                if (options == null) {
                    continue;
                }
                System.out.println("■ ☕카푸치노가 추가되었습니다.");
                total_order(order, "카푸치노", options);
                count += 1;
                money += 4000;
                if (options[0].equals(shot)) {
                    money += 500;
                }
                if (options[1].equals(syrup)) {
                    money += 500;
                }

            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        sc.close();
    }

}
