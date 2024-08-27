class pens{
    String color ;
    int cost  ;
    static String use = " likne ke liye ";
    public static void show(pens objct){
        System.out.println(objct.color + " : "+objct.cost + " : "+use);
    }
}

public class Practice {
    public static void main(String a[]){
        pens obj1 = new pens();
        obj1.color = "blue";
        obj1.cost = 10;
        pens obj2 = new pens();
        obj2.color = "red";
        obj2.cost = 15;


        pens penArray[] = new pens[2];
        penArray[0] = obj1;
        penArray[1] = obj2;
        

        for(pens pen : penArray){
            pens.show(pen);
        }
    }
}
