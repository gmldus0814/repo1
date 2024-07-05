package exam;

public class MemberJoinExam {
    public static void main(String[] args) {
        // 아이디, 비밀번호는 필수
        // 주소를 입력하기 싫으면 null
        // 나이를 입력하기 싫으면 -1
        // 성별을 입력하기 싫으면 -1
        MemberJoin member = new MemberJoin();
        member.join("id", "pw", "주소", 20, 1);
    }
}
