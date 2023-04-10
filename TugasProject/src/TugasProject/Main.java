package TugasProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        TugasProject.Login user_login = new TugasProject.Login();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("S I L A H K A N   L O G I N");
        System.out.print("Masukkan UserName : ");
        String user = bf.readLine();
        System.out.print("Masukkan Password : ");
        String pw = bf.readLine();
        System.out.println("=============================");
        if (user.equals(user_login.getUser()) && pw.equals(user_login.getPw_user()) || user.equals(user_login.getAdmin()) && pw.equals(user_login.getPw_admin())) {
            if (user.equals(user_login.getUser())) {
                System.out.println("Selamat datang User");
            } else if (user.equals(user_login.getAdmin())) {
                System.out.println("Selamat datang Admin");
            }
        }

    }
}