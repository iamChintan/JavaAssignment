import java.util.Scanner;

public class AssignmentTask1 {
    public static void main(String[] args) {

        // problem 1: Print your name using a pre-defined variable.
        String name = "Chintan";
        System.out.println("My name is " + name);



        // problem 2:  Take the user's name as input and print it to the console.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String uName = sc.nextLine();
        System.out.println("Welcome " + uName);



        //problem 3: Swap two numbers using the third variable as the result name and do
        //the same task without using any third variable.
        int a = 40;
        int b = 10;

        // using third varibale
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : " + a + " b : " + b);

        // without third varibale
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a : " + a + " b : " + b);



        // problem 4:  Write a program to add two numbers.
        int sum = a + b;
        System.out.println(sum);



        // problem 5: Write a program to print the area of circle, Take radius as input from
        //the user.(Area = 3.14*radius*radius)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius ");
        double radius = scanner.nextDouble();

        double area = 3.14 * radius * radius;
        System.out.println(area);

    }
}
