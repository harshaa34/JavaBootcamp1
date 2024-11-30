import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Comment is added from the repo
        int x, y, result;
        String operator;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the 1st number:");
        x = sc.nextInt();
        System.out.println("Please enter the 2nd number:");
        y = sc.nextInt();

        System.out.println("Enter the operation to perform:");
        operator = sc.next();

        result = switch (operator) {
            case "+" -> {
                yield x + y;
            }
            case "-" -> {
                yield x - y;
            }
            case "*" -> {
                yield x * y;
            }
            case "%" -> {
                yield x % y;
            }
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };

        System.out.println("The answer is " + result);
    }
}
