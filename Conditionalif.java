import java.util.Scanner;

public class Conditionalif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.println("You Have Voter card ? : ");
        boolean voterCard= scanner.nextBoolean();
        if (age > 18) {
            if (voterCard) {
                System.out.println("You Can Vote");
            }
            else{
                System.out.println("You can not allowed for vote");
            }
        }
    }
}





