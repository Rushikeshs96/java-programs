import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class findthirdhighestvaluefromarray {
    public static void main(String[] args) {
        int arr[]={1,5,3,8,6,4,8,56};

        List<Integer> list=new ArrayList<>();

        for(int a:arr)
        {
            list.add(a);
        }

        //to find third highest using stream api
        list.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(n->System.out.println(n));
    }
}
