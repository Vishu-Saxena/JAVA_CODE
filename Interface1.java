
interface A{
    int age = 4;
    String area = "agartala";
    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("in show");
    };
    public void config(){
        System.out.println("in config");
    }
}


public class Interface1 {
    public static void main(String[] args) {
        A objA = new B();
        objA.config();;
        objA.show();
    }
}
