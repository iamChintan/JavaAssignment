import java.util.Scanner;

public class AssignmentTask3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Problem 1: FibonacciSeries
        System.out.println("Please Enter the number for Fibonacci : ");
        int num = input.nextInt();

        int prevNum = 0, currNum = 1, nextNum;
        for (int i = 0; i <= num; i++){
            System.out.print(prevNum + " ");
            nextNum = prevNum + currNum;
            prevNum = currNum;
            currNum = nextNum;
        }

        System.out.println(" ");

        // problem 2: Factorial
        System.out.println("Please Enter the number for Factorial : ");
        int fact = input.nextInt();
        int factorial = 1;

        for (int i = 1; i <= fact; i++){
            factorial *= i;
        }
        System.out.println(" factorial is "  + factorial);
        System.out.println(" ");


        // problem 3: Check Palindrome.

    }
}
