import java.util.Scanner;

public class Calculator {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Let's use our Calculator");
        int first = getNumber();
        int second = getNumber();
        char operation = getOperation();
        int result = calculate(first,second,operation);
        System.out.println("Result is \n " + result);
    }


    public static char getOperation(){
        System.out.println("choose your operation");
        char operation;
        operation = scan.next().charAt(0);

        return operation;
    }
    public static int getNumber(){
        System.out.println("type your number");
        int num;
            num = scan.nextInt();

        return num;
    }
    public static int calculate(int first, int second, char operation){
        int result;

        switch (operation){
            case '+' -> {
                result = first + second;
                break;
            }
            case '-' -> {
                result = first - second;
                break;
            }
            case '*' -> {
                result = first * second;
                break;
            }
            case '/' -> {
                result = first / second;
            }
            default -> {
                System.out.println("Something went wrong, try one more time");
                scan.next();
                result = calculate(first,second,getOperation());
            }
        }
        return result;
    }




}
