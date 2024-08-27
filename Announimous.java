class Pen{
    private int cost;
    public Pen(){
        cost = 10;
        System.out.println("object is created");
    }
    public void show(){
        System.out.println("cost of your pen is : " +cost);
    }
}

class A{
    public int num = 20;
}

class B extends A{
    public int num2 =10;
}
class C extends B{
    public void show(){
        System.out.println(num + " "+ num2);
    }
}

public class Announimous {
    public static void main(String a[]){

        C obj1 = new C();
        obj1.show();

    }
}
