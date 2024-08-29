class A{
    public int marks = 90;
    public void show(){
        System.out.println("in A");
    }
}

class B extends A{
    public char grade = 'A';
    public void show(){
        System.out.println("in B");
        System.out.println(grade);
    }
}
public class Practice1 {
    public static void main(String[] args) {
        int num = 90;
        Integer num1 = num;
        System.out.println(num1.valueOf(19087656434));
        System.out.println(num1);
    }
    
}