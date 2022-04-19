import java.util.Arrays;


public class Helloworld {
    int a=45;
    static int b=20;
    public static void main(String[] args){
    int [] arr = new int[]{1,2,3,4,5};
    System.out.println(Arrays.toString(arr));
    Helloworld obj= new Helloworld();
    System.out.println(obj.a);
    System.out.println("local variable"+b);
    printName();
    }
    public static void printName(){
        String name ="Rajesh Sah"; //Local Variable
        System.out.println(name);

    }
}