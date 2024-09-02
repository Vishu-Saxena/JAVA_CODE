import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionApi {
    public static void main(String[] args) {
        // List<Integer> nums = new ArrayList<Integer>();
        // nums.add(2);
        // nums.add(3);
        // nums.add(6);
        // nums.add(28);

        // nums.addAll(nums);
        // boolean res=  nums.containsAll(nums);
        // System.out.println(res);
        // System.out.println(nums.get(0));
        
        // for(int i : nums){
        //     System.out.println(i);  
        // }

        // Set <Integer> sets = new TreeSet<Integer>();
        // sets.add(1);
        // sets.add(90);
        // sets.add(4);
        // sets.add(0);

        // for(int n :sets){
        //     System.out.println(n);
        // }
        // System.out.println(sets);

        // maps 
        Map <String , Integer> students = new HashMap<String , Integer>();
        students.put("Mansi", 100);
        students.put("shanu", 80);
        students.put("Pooja", 70);
        students.put("usha", 86);

        Set <String> Names = students.keySet();
        for(String key : Names){
            System.out.println(key +  " : " + students.get(key));
        }

        System.out.println(students);
    }
}
