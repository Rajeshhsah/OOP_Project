import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter The Principal: ");
        float principal = scanner.nextFloat();
        System.out.println("Enter The rate: ");
        float rate = scanner.nextFloat();
        System.out.println("Enter The Time: ");
        float time = scanner.nextFloat();
        float si = principal*rate*time/100;
        System.out.println(" The simple interest is "+(si));
    }
}
class areaoftriangle{
    public static void main(String[] args) {

    }
}