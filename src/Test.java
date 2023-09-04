import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("LOGIN SYSTEM");
        System.out.println("Username:");
        String a = sc.next();
        char s = ' ';
        char m = ' ';
        if (a.length() < 4 || a.length() > 20) {
            s='f';
        }
        else if (!a.matches("^[a-zA-Z0-9_]+$")) {
            s='f';
        }
        else if (a.contains(" ")) {
            s='f';
        }
        if (s == 'f'){
            System.out.println("(Rewrite the username as the requirements of the username is not fulfilled)");
            System.out.println("Username:");
            a = sc.next();
        }
        System.out.println("Password:");
        String b = sc.next();
        if (b.length() < 8 || b.length() > 20) {
            m='f';
        }
        else if (!b.matches("^[a-zA-Z0-9_]+$")) {
            m='f';
        }
        else if (b.contains(" ")) {
            m='f';
        }
        if (m == 'f'){
            System.out.println("(Rewrite the password as the requirements of the username is not fulfilled)");
            System.out.println("Password:");
            b = sc.next();
        }

        System.out.println("Login Successful");

        System.out.println("Now you can pick an operation");
        System.out.println("1. Greatest number between three numbers of your choice ");
        System.out.println("2. Calculator");
        System.out.println("3. Result calculator with three grades");
        System.out.println("4. Guessing Game");
        System.out.println("Pick the assigned number of the operation you want");

        int i = sc.nextInt();

        if(i == 1) {
            System.out.println("Welcome to the first operation");
            System.out.println("In this operation, you give three different numbers and we find out which ones the greatest of them all");
            System.out.println("Enter the first number:");
            int c = sc.nextInt();
            System.out.println("Enter the second number:");
            int d = sc.nextInt();
            System.out.println("Enter the third number:");
            int e = sc.nextInt();





            if (c > d && c > e) {
                System.out.println("The first number is the greatest of the three number.");
            } else if (d > c && d > e) {
                System.out.println("The second number is the greatest of the three numbers.");
            } else if (e > c && e > d) {
                System.out.println("The third number is the greatest of the three numbers.");
            } else {
                System.out.println("The input is invalid or the numbers are equal");
            }

        } else if (i ==2) {
            System.out.println("CALCULATOR");
            System.out.println("The available operations are:'+','-','*','/'.");

            System.out.println("Enter your first number:");
            float x = sc.nextFloat();
            System.out.println("Enter your second number:");
            float y = sc.nextFloat();
            System.out.println("Enter your operation");
            String z = sc.next();

            switch (z) {
                case "+":
                    double v = x + y;
                    System.out.println("The result is" + v);
                    break;
                case "-":
                    v = x - y;
                    System.out.println("The result is" + v);
                    break;
                case "*":
                    v = x * y;
                    System.out.println("The result is" + v);
                    break;
                case "/":
                    v = x / y;
                    System.out.println("The result is" + v);
                    break;
                default:
                    System.out.println("The input is invalid.");
            }
        } else if (i ==3) {
            System.out.println("RESULT CALCULATOR");
            System.out.println("Enter the marks of the first subject subjects out of 100");
            float u = sc.nextFloat();
            System.out.println("Enter the marks of the second subject subjects out of 100");
            float o = sc.nextFloat();
            System.out.println("Enter the marks of the third subject subjects out of 100");
            float p = sc.nextFloat();


           double k = (u + o + p) / 3;

            if (k<30 ){
                System.out.println("The result is NG.");
            }
            else if (k>=30 && k<40) {
                System.out.println("The overall grade is D.");
            }
            else if (k>=40 && k<50) {
                System.out.println("The overall grade is D+.");
            }
            else if (k>=50 && k<60) {
                System.out.println("The overall grade is C.");
            }
            else if (k>=60 && k<70) {
                System.out.println("The overall grade is C+.");
            }
            else if (k>=70 && k<80) {
                System.out.println("The overall grade is B+.");
            }
            else if (k>=80 && k<90) {
                System.out.println("The overall grade is A.");
            }
            else if (k>=90 && k<=100) {
                System.out.println("The overall grade is A+.");
            }
            else  {
                System.out.println("The input is invalid.");
            }


        }
        else if (i == 4) {
            System.out.println("Welcome to Guessing Game");
            System.out.println("You will win the game if yo guess the correct number");
            System.out.println("Let us Begin!!Enter a number:");
            float j = sc.nextFloat();
            Random random = new Random();
            int randomNumber = random.nextInt(10);
            if (j == randomNumber){
                System.out.println("Congratulations! Your guess is right. You win the prize!");

            }
            else {
                System.out.println("Wrong Number, better luck next time :(");
            }

        }

    }

}

