import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int ans = 0;
            
            while (true) {
                System.out.print("Enter an operator (+, -, *, /, %) or 'q' to quit:");
                char op = in.next().trim().charAt(0);
                
                if (op == 'q') {
                    break;
                }
                
                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                    System.out.print("Enter two integers:");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                    
                    if (op == '+') {
                        ans = num1 + num2;
                    }
                    
                    if (op == '-') {
                        ans = num1 - num2;
                    }
                    
                    if (op == '*') {
                        ans = num1 * num2;
                    }
                    
                    if (op == '/') {
                        if (num2 != 0) {
                            ans = num1 / num2;
                        }
                    }
                    
                    if (op == '%') {
                        ans = num1 % num2;
                    }
                } else {
                    System.out.println("Invalid operation");
                }
                System.out.println("The result is: " + ans);
            }
        }
        System.out.println("Program terminated");
    }
}