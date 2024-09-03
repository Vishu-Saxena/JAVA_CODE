import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * StreamApi
 */
public class StreamApi {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(7);
        nums.add(5);
        nums.add(4);

    //     Stream<Integer> s1 = nums.stream();
    // //    s1.forEach(n->System.out.println(n));
    //    Stream <Integer> s2 = s1.filter(n->n%2 == 0);
    // //    s2.forEach(n->System.out.println(n));
    //     Stream <Integer> s3 = s2.map(n->n+2);
    //     s3.forEach(n->System.out.println(n));

           int a = nums.stream().filter(n->n%2==0).map(n->n+2).reduce(0 , (c,e)->c+e);
           System.out.println(a);



        // System.out.println(s1);
    }
}