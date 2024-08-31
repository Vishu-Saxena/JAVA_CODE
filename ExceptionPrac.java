
class MyException extends Exception{
    public MyException(String str){
        super(str);
        // System.out.println("this exception is defined by me.");
        // System.out.println(str);
    }
}

class A{
    public int show(int a , int b) throws ArithmeticException {
        System.out.println("this is show method.");
        return a+b;
    }
}

public class ExceptionPrac {
    public static void main(String[] args) {
        int a = 4;
        int b =10;
        int num[] = new int[5];
        int res;
        String str = null;

        try {
            // System.out.println(str.length());
            // System.out.println(num[8]);
            res = a/b;
            if(res == 0){
                throw new MyException("your denominator is greater than numerator.");
            }   
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(MyException e){
            System.out.println(e);
        }
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("something went wrong... " + e );
        }
        System.out.println("bye");

        A obj = new A();
        obj.show(1,2);

    }
}
