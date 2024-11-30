import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //comment is added from repo
        int x,y,sum;
        String operator;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the 1st number:");
        x = sc.nextInt();
        System.out.println("Please enter the 2nd number:");
        y =sc.nextInt();

        System.out.println("Enter the operation to perfom: ");
        operator = sc.next();


       sum = switch (operator) {
           case "+"-> x+y;
           case "-"-> x-y;
           case "*"-> x*y;
           case "%"-> x%y;

           default -> throw new IllegalStateException("Unexpected value: " + operator);
       };

        System.out.println("The answer is "+sum);
    }
}
