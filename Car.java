public class Car {
    int tyre;
    String engine;

    public Car(){
        tyre = 4;
        engine = "deisel";
    }
    public void show(){
        System.out.println("tyre : " + tyre + " " + "engine : "+ engine);
    }
    public void showEngine(){
        System.out.println(engine);
    }
}
