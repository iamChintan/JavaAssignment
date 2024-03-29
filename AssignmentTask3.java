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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String for Palindrome : ");
        String str = sc.nextLine();

        if (isPalindrome(str))
            System.out.println("Given string is Palindrome");
        else
            System.out.println("Given string is not Palindrome");
        System.out.println(" ");




        // problem 4: check number is prime or not
        System.out.print("Enter a positive integer for prime: ");
        int numPrime = input.nextInt();

        if (isPrime(numPrime))
            System.out.println("Given number is prime");
        else
            System.out.println("Given number is non prime");
        System.out.println(" ");



        // Problem 5: Sum of first even n Numbers
        System.out.print("Enter a positive integer for sum: ");
        int n = input.nextInt();

        int i = 1, sum = 0;
        while (i <= n) {
            sum += 2*i;
            i++;
        }

        System.out.println("The sum of the first " + n + " even numbers is " + sum);
        System.out.println(" ");



        // Problem 6: Sum of two numbers using loop
        char choice;

        do {
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();

            int total = num1 + num2;
            System.out.println("The sum is " + total);

            System.out.print("Do you want to perform the operation again? (Y/N): ");
            choice = input.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        System.out.println(" ");




        // problem 7: Pattern
        PrintPattern();


    }

    private static void PrintPattern() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i < Math.sqrt(num); i++){
            if (num % i == 0)
                return false;
        }
        return true;
    }

    private static boolean isPalindrome(String str) {
        int i = 0, j = str.length() -1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
