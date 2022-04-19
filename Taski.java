import java.util.Scanner;


//1 Write a program to take student details as input and display the result.

public class Taski {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Name :- ");
        String name =scanner.nextLine();
        System.out.println("Enter Your Address :- ");
        String address =scanner.nextLine();
        System.out.println("Your Name is "+(name));
        System.out.println("Your Address is "+(address));


    }
}
