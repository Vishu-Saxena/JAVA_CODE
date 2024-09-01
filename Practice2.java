
/**
 * Practice2
 */
import java.util.Scanner;
public class Practice2 {

    static int add(int a , int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter first interger");
        int num1 = s.nextInt();
        System.out.println("enter second integer");
        int num2 = s.nextInt();
        System.out.println( add(num1 , num2));
    }
}