import java.util.HashSet;
import java.util.Set;

public class duplicate {
    public static void main(String[] args) {
        int arr[]={2,2,4,5,6,4,5,8,};

        Set<Integer>set=new HashSet<>();

        Set<Integer>d=new HashSet<>();

        for(int a:arr)
        {
            if(!(set.add(a)))
            {
                d.add(a);
            }
        }
        
        System.out.println("duplicate elements in array are "+ d);
    }
}
