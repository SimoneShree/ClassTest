import java.util.Scanner;

public class Login2 {
    public static void main(String[] args) {
        String x, y;
        char a, b;

        Scanner sc = new Scanner(System.in);
        System.out.println("LOGIN SYSTEM");
        System.out.println("Enter your username:");
        x = sc.next();
        a = ' ';
        b= ' ';

        if (x.length() < 5 || x.length() > 15) {
            a = 'f';
        } else if (x.contains(" ")) {
            a = 'f';
        }
        if (a == 'f') {
            System.out.println("(Rewrite the username as the requirements of the username is not fulfilled)");
            System.out.println("Username:");
            x = sc.next();
        }
        System.out.println("Enter your password:");
        y = sc.next();
        if (y.length() < 8 || y.length() > 15) {
            b = 'f';
        } else if (y.contains(" ")) {
            b = 'f';
        }
        if (b == 'f') {
            System.out.println("(Rewrite the password as the requirements of the username is not fulfilled)");
            System.out.println("Password:");
            y = sc.next();
        }

        System.out.println("Login Successful");

    }
}



