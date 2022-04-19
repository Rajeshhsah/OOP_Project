import java.util.Scanner;

public class Userio {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter First Number: ");
        Integer a = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        Integer b = scanner.nextInt();
        System.out.println("The sum of a & b is : "+(a+b));
        System.out.println("The Number of a : "+(a));
    }
}
