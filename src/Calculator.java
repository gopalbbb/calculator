import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("My Calculator");

        // Used to store user input
        int a = 0;
        int b = 0;

        // Input Handling
        try {
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter two numbers: ");
            a = inp.nextInt();
            b = inp.nextInt();
        } catch (Exception e){
            System.out.println("Only integer values are accepted\n" + e);
            System.exit(1);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the operation that you'd like to perform. One of '+' | '-' | '*' | '/'");
        String operation = sc.nextLine();


        switch (operation) {
            case "+":
                System.out.println("Addition = " + add(a,b));
                break;
            case "-":
                System.out.println("Subtraction = " + subtract(a,b));
                break;
            case "*":
                System.out.println("Multiplication = " + multiply(a,b));
                break;
            case "/":
                System.out.println("Division = " + divide(a,b));
                break;
            default:
                System.out.println("No operation specified");
                System.exit(2);
        }
    }

    // Performs addition
    public static int add(int a, int b){
        return a+b;
    }

    // Performs subtraction
    public static int subtract(int a, int b){
        return a-b;
    }

    // Performs multiplication
    public static int multiply(int a, int b){
        return a*b;
    }

    // Performs division
    public static int divide(int a, int b){
        return a/b;
    }
}
