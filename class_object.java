
// checking method overloading
class calculator{
    public int add(int n1 , int n2){
        return n1+n2;
    }
    public int add(int n1 , int n2 , int n3){
        return n1 + n2 + n3;
    }
    public int add(int n2 , double n1){
        return (int) (n1 + n2);
    }
}

class calender{
    public String month(int num){
        String result;
        switch (num){
            case 1 -> result = "January" ;
            case 2 -> result = "febuary";
            case 3 -> result = "march";
            case 4 -> result = "April";
            case 5 -> result = "May";
            case 6 -> result = "June";
            default -> result = "enter a valid month number";
        }
        return result;
    }
}



 class class_object {

    public static void main(String a[]){
        int num1 = 4;
        // calender caln = new calender();
        // System.out.println(caln.month(num1)); 
        // int num2 = 5;
        // calculator clc = new calculator();
        // int result = clc.add(num1 , num2);
        // System.out.println(result);
        int num2 = 4;
        int num3 = 45;
        double num4 = 5.66;
        calculator obj = new calculator();
        System.out.println(obj.add( num1 , num2));
        System.out.println(obj.add(num3, num4));
        System.out.println(obj.add(num1 , num3 , num2));
    }
}
