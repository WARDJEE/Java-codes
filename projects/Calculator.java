package projects;
import java.util.Scanner;

public class Calculator {
    static void main() {
        double num1;
        double num2;
        char math;
        double result = 0;
        boolean ok = true;

        Scanner scan = new Scanner(System.in);

        System.out.print("Give first number: ");
        num1 = scan.nextDouble();

        do {
            System.out.print("Give an operator (+, -, *, /, ^): ");
            math = scan.next().charAt(0);

            if (!"+-*/^".contains(String.valueOf(math))) {
                System.out.println("Invalid operator. Please try again.");
            }
        } while (!"+-*/^".contains(String.valueOf(math)));

        System.out.print("Give second number: ");
        num2 = scan.nextDouble();

        scan.close();

        switch(math){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' ->
            {if(num2 == 0){
                System.out.println("Cannot divide by 0!");
                ok = false;}
            else{
                result = num1 / num2;}
            }
            case '^' -> result = Math.pow(num1, num2);
        }

        if (ok){
            System.out.println("The result is " + result);}
    }
}
