class student{
    int marks;
    String name ;
}

public class arrays_object{

    public static void main(String a[]){
        student s1 = new student();
        s1.name = "Mansi Saxena";
        s1.marks = 90;
        student s2 = new student();
        s2.name = "Shanu";
        s2.marks = 80;
        student s3 = new student();
        s3.name = "usha";
        s3.marks = 85;
        student studentArray[] = new student[3];
        studentArray[0] = s1;
        studentArray[1]= s2;
        studentArray[2]= s3;

        
        for(student stud : studentArray){
            System.out.println(stud.name + " " + stud.marks);
        }
    }
}
