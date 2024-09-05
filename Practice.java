import java.util.Scanner;


class calculator{
    public void add(int a , int b){
        System.out.println(a+b);
    }

    public void increment(int a){
        System.out.println(++a);
    }

    public int increment(double a){
        return (int) ++a;
    }

    public void add(int a , int b , int c){
        System.out.println(a+b+c);
    }
}



public class Practice {

    public static void main(String[] args) {
        int row ;
        Scanner s = new Scanner(System.in);
        System.out.print("enter number of rows : ");
        row = s.nextInt();

       int num[][] = new int[row][];
       for(int i =0 ; i< row ; i++){
        int col;
        System.out.println("enter the first colomn number : ");
        col = s.nextInt();
        num[i] = new int[col];
       }
       for(int i =0; i<row ; i++){
        for(int j =0 ; j < num[i].length ; j++){
            num[i][j] = (int)(Math.random()*10);
            System.out.print(num[i][j] + " ");
        }
        System.err.println();
       }
        
        System.out.println("");
       }

       
       
    }