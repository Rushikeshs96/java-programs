import java.util.Arrays;
import java.util.List;

public class streamApi{
    public static void main(String[] args) {
       
        List<Integer>nums= Arrays.asList(4,5,7,8,9);

        //foreach for iterating collection using lamda function
        //nums.forEach(n->System.out.print(n+" "));
        
      

       nums.stream().filter(n->n%2==0).sorted().map(n->n*2).forEach(n->System.out.print(n+" "));
    }
}