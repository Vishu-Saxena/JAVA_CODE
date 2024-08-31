interface A{
    public void show();
}


@FunctionalInterface
interface B{
    public int add(int a , int b);
}

/**
 * Practice1
 */
public class Practice1 {

    public static void main(String[] args) {
        A obj = () -> System.out.println("in show");
        obj.show();

        B obj2 = (a , b) -> a+b;
        int result = obj2.add(3, 5);
        System.out.println(result);
    };

        
}