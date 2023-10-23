package Start;

public class LoginAndSignUp {
    public static void main(String[] args) {    // 맨 처음 로그인 창으로 나오게 함
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
    }
}