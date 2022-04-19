import java.util.Scanner;

public class Taskii {
    public static void main(String[] args) {
        //2. Write a program to calculate sum of four numbers taking user input.
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = scanner.nextInt();
        System.out.println("Enter 3rd Number: ");
        int c = scanner.nextInt();
        System.out.println("Enter 4th Number: ");
        int d = scanner.nextInt();
        System.out.println("The Sum of All Number is :- "+(a+b+c+d));


    }
}
