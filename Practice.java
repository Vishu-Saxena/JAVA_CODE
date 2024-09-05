import java.util.Scanner;


class Caclculator{
    public int add( int a , int b){
        return a+b;
    }
    public int sub(int a , int b){
        return a-b;
    }
}

class AdvanceCalc extends Caclculator {
    public int multiply(int x , int y){
        return x*y;
    }
    public int devide(int divident , int devisor){
        return divident/devisor;
    }
}
class ScientificCalc extends AdvanceCalc{
    public int reminder(int x , int y){
        return x%y;
    }
}


public class Practice {

    public static void main(String[] args) {
        ScientificCalc sc1 = new ScientificCalc();
        System.out.println(sc1.add(2, 8));
        System.out.println(sc1.sub(6, 2));
        System.out.println( sc1.multiply(2, 4));
        System.out.println(sc1.devide(8, 2));
        System.out.println(sc1.reminder(9, 5));
    }

}