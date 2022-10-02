import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("My Calculator");

//        MyClass obj = new MyClass();
//        System.out.println(obj.getValue());
//        obj.multiplyByHundred(37);
//        System.out.println(obj.getValue());

        MyClass myObject = new MyClass();

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
                System.out.println("Addition = " + myObject.add(a,b));
                break;
            case "-":
                System.out.println("Subtraction = " + myObject.subtract(a,b));
                break;
            case "*":
                System.out.println("Multiplication = " + myObject.multiply(a,b));
                break;
            case "/":
                System.out.println("Division = " + myObject.divide(a,b));
                break;
            default:
                System.out.println("No operation specified");
                System.exit(2);
        }
    }

}
