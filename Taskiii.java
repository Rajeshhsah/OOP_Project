import java.util.Scanner;

public class Taskiii {
    public static void main(String[] args) {
            double a,b,c;
        /*3. Write a program to take input of the total marks of four subjects of a student and calculate
        the total percentage secured. Then display the percentage and final result of the student;
        a. If equal to or more than 70 -> First Class
        b. If more than 59 -> Upper second Class
        c. If more than 49 -> Second class
        d. If more than 39 -> Third class and if below than 40 the result is fail.*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Full Marks :- ");
        double marks= scanner.nextDouble();
        a=marks/400*100;
        System.out.println("Total Percentage of Marks is "+(a));

    }
}
