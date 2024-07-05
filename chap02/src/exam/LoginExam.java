package exam;

public class LoginExam {
    public static void main(String[] args) {
        Login login = new Login();

        login.setId("gmldus");
        login.setPw("gmldus");
        System.out.println(login.Login("gmldus", "gmldus"));

    }
}
