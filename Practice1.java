

class Car{
    private String engine ;
    private String body;

    private static int tyre;

    public void setEngine(String eng){
        this.engine = eng;
    }

    public void setTyre(int tyre){
        this.tyre = tyre;
    }

    public int getTyre(){
        return this.tyre;
    }
    public String getBody(){
        return this.body;
    }
    
    public String getEngine(){
        return this.engine;
    }
    

    static{
        tyre = 4;
    }

    // constructor
    public Car(){
        this.engine  = "petrol";
        this.body = "mettalic";
        this.tyre = 2;
    }
    public Car(String engine , String body ){
        this.engine = engine;
        this.body = body;
    }

    public void show(){
        System.out.println("tyre : " + this.tyre + " " + "body : " + this.body + " " + "engine : " + this.engine );
    }

}

class TataMotors extends Car {
    private int models;
    private int cost;

    public void setCost(int cost){
        this.cost = cost;
    }
    public void setModels(int models){
        this.models = models;
    }

    public int getCost(){
        return this.cost;
    }

    public int getModels(){
        return this.models; 
    }

    // constructor
    public TataMotors(){
        models = 100;
        cost = 200000;
    }

    public void show(){        
        System.out.println("Models : " + models + " ," + "cost : " + cost + " , " + "Tyres : " + this.getTyre() + " , " + "body : "+ this.getBody() );
    }

}

public class Practice1 {
    public static void main(String a[]){
        TataMotors t1 = new TataMotors();
        t1.show();
        new TataMotors().show();
    }
}