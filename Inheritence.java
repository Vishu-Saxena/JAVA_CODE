
class Company extends Car{
    private String brandName;
    private int price;
    public Company(String brandName, int price) {
        this.brandName = brandName;
        this.price = price;
    }
    public void show(){
        System.out.println("tyre : " + tyre + " " + "engine : " + engine + " " + "brandName : " + brandName + " " + "price : " + price);
    }
    
    
}

public class Inheritence {
    public static void main(String a[]){
        Company c1 = new Company("jaguar", 1000000);
        c1.show();
        c1.showEngine();
    }
}
