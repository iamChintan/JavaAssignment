import java.util.Scanner;

public class AssignmentTask2 {

    public static void main(String[] args) {

        // problem 1: Write a program to check whether a number is positive or negative.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();

        if (number > 0)
            System.out.println("number is positive");
        else if (number < 0)
            System.out.println("number is negative");
        else System.out.println("number is zero");



        // problem 2: Write a program to check whether a character is an alphabet or not.
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }


        // problem 3: Write a program to compute quotient and reminder

        System.out.print("Enter the dividend: ");
        int dividend = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The quotient is: " + quotient + " remainder is:  " + remainder);


        // problem 4: Write a program to check whether a year is a leap year.
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");



        // problem 5: Assignment grades
        System.out.print("Enter percentage: ");
        double percentage = input.nextDouble();
        char grade;

        if (percentage > 90.0) {
            grade = 'A';
        } else if (percentage > 75.0) {
            grade = 'B';
        } else if (percentage > 65.0) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Grade: " + grade);




        // Problem 6: Calculator

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        char operator = input.next().charAt(0);
        double result;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Invalid operator.");
                input.close();
                return;
            }
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);




        // Problem 7: Break & Continue
        while (true) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if (num < 0) {
                System.out.println("It's Over");
                break;
            } else {
                System.out.println("Good Going");
                continue;
            }
        }


        // Problem 8: Income Tax

        System.out.print("Enter income amount: ");
        double income = input.nextDouble();
        double tax = 0;

        if (income >= 250000 && income < 600000) {
            tax = (income - 250000) * 0.1;
        } else if (income >= 600000 && income < 1200000) {
            tax = 35000 + (income - 600000) * 0.18;
        } else if (income >= 1200000) {
            tax = 125000 + (income - 1200000) * 0.25;
        }

        System.out.println("Income tax to be paid: " + tax);



        // Problem 9: Electicity bill
        System.out.print("Enter the electricity unit charge: ");
        int units = input.nextInt();
        double bill = 0;

        if (units <= 60) {
            bill = units * 0.3;
        } else if (units <= 150) {
            bill = 60 * 0.3 + (units - 60) * 0.75;
        } else if (units <= 270) {
            bill = 60 * 0.3 + 90 * 0.75 + (units - 150) * 1.1;
        } else {
            bill = 60 * 0.3 + 90 * 0.75 + 120 * 1.1 + (units - 270) * 2.5;
        }

        bill *= 1.2; // add 20% surcharge

        System.out.println("Total electricity bill: Rs. " + bill);



        // problem 10: Gross Salary
        System.out.print("Enter the basic salary: ");
        double basicSalary = input.nextDouble();
        double grossSalary = 0;
        double hra = 0;
        double da = 0;

        if (basicSalary <= 15000) {
            hra = 0.25 * basicSalary;
            da = 0.82 * basicSalary;
        } else if (basicSalary <= 20200) {
            hra = 0.27 * basicSalary;
            da = 0.9 * basicSalary;
        } else {
            hra = 0.36 * basicSalary;
            da = 0.95 * basicSalary;
        }

        grossSalary = basicSalary + hra + da;

        System.out.println("Basic Salary: Rs. " + basicSalary);
        System.out.println("HRA: Rs. " + hra);
        System.out.println("DA: Rs. " + da);
        System.out.println("Gross Salary: Rs. " + grossSalary);

        input.close();

    }

}
