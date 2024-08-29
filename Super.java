
class A{
    public A(){
        System.out.println("inside A");
    }
    public A(int a){
        System.out.println("in int a");
    }
    public void show(){
        System.out.println("this is show of a");
    }
    public int add(int a , int b){
        return a+b;
    }
}

class B extends A{
    public B(){
        super(4);
        
        System.out.println("in B");
    }
    public B(int b){
        
        
        this();
        System.out.println("in int B");
    }

    public void show(){
        System.out.println("show of b");
    }

    public int add(int a , int b){
        return a+b +1;
    }
}

public class Super {
    public static void main(String a[]){
        B b1 = new B(3);
        b1.show();
        int res = b1.add(3, 5);
        System.out.println(res);
    }

}
