import java.util.Scanner;

public class Login1 {
    public static void main(String[] args) {
        String a, b;
        char x,y;
        Scanner sc = new Scanner(System.in);

        System.out.println("LOGIN SYSTEM");
        System.out.println("Username:");
         a = sc.next();
         x = ' ';
        y = ' ';
        if (a.length() < 5 || a.length() > 15) {
            x = 'f';
        } else if (a.contains(" ")) {
            x = 'f';
        }
        if (x == 'f') {
            System.out.println("(Rewrite the username as the requirements of the username is not fulfilled)");
            System.out.println("Username:");
            a = sc.next();
        }
        System.out.println("Password:");
         b = sc.next();
        if (b.length() < 8 || b.length() > 15) {
            y = 'f';
        } else if (b.contains(" ")) {
            y = 'f';
        }
        if (y == 'f') {
            System.out.println("(Rewrite the password as the requirements of the username is not fulfilled)");
            System.out.println("Password:");
            b = sc.next();
        }

        System.out.println("Login Successful");

    }
}
