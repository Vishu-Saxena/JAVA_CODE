import java.util.Scanner;
import java.lang.Exception;


class Calculator{
    public int divide(int a , int b) throws ArithmeticException{
        return a/b;
    }
}

public class Practice {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        try{
            c1.divide(6, 0);
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }
        
    }

}