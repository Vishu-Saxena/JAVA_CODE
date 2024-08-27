
class pen {
    private String color;
    private int stock;
    // default constructor
    public pen(){
        this.color = "blue";
        this.stock = 10;
    }

    public void getStock(){
        System.out.println(stock);
    }
    public void getColor(){
        System.out.println(color);
    }
    public void setStock(int stc){
        stock= stc;
    }
    public void setColor(String clr){
        color= clr;
    }
}

public class encapsulation {
    public static void main(String a[]){
        pen obj1 = new pen();
        // obj1.setColor("black");
        // obj1.setStock(5);
        obj1.getColor();
        obj1.getStock();
    }
    
} 