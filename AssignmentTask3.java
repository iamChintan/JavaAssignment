import java.util.Scanner;

public class AssignmentTask3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Problem 1: FibonacciSeries
        System.out.println("Please Enter the number : ");
        int num = input.nextInt();

        int prevNum = 0, currNum = 1, nextNum;
        for (int i = 0; i <= num; i++){
            System.out.print(prevNum + " ");
            nextNum = prevNum + currNum;
            prevNum = currNum;
            currNum = nextNum;
        }

    }
}
