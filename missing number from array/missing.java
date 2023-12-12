public class missing {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,7,8,9,10};
        int n=arr.length+1;

        int expected=(n*(n+1))/2;

        int actual=0;

        for(int a:arr)
        {
            actual+=a;
        }

        int missing=expected-actual;

        System.out.println(missing);
    }
    
}
