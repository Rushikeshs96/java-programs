public class fibonachi {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        System.out.println(first+ " "+second);
        
        for(int i=2;i<100;i++)
        {
            int next=first+second;
            System.out.println(next);
            
            first=second;
            second=next;
        }
    }
}
