package exam;

public class Login {
    /*
        생성자로 id, pw를 받아서 저장해 놓음 (회원가입)
        login(아이디, 패스워드) 실행하면
        login메소드 안에서...
        만약 같으면 "메인페이지" 출력하고 true 돌려줌
        다르면 "로그인 화면으로 돌아감" 출력하고 false 돌려줌
     */

    String id;
    String pw;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    boolean Login(String id, String pw) {
        if(getId().equals(id) && getPw().equals(pw)) {
            System.out.println("메인페이지");
            return true;
        }
        else {
            System.out.println("로그인 화면으로 돌아감");
            return false;
        }
    }

}
