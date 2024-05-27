import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter an operator (+, -, *, /, %) or 'q' to quit: ");
                char op = in.next().trim().charAt(0);

                if (op == 'q') {
                    break;
                }

                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                    System.out.print("Enter two integers: ");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();

                    int result = calculate(num1, num2, op);
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Invalid operation");
                }
            }
        }
        System.out.println("Program terminated");
    }

    public static int calculate(int num1, int num2, char op) {
        int ans = 0;
        switch (op) {
            case '+' -> ans = num1 + num2;
            case '-' -> ans = num1 - num2;
            case '*' -> ans = num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    ans = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                }
            }
            case '%' -> ans = num1 % num2;
            default -> System.out.println("Invalid operator");
        }
        return ans;
    }
}