public class maxmin {
    public static void main(String[] args) {
        
        int[] arr = {5, 8, 6, 13, 3, -1};
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

            if(arr[i]<min)
            {
                min=arr[i];
            }
        }

        System.out.println("max element is "+max);
        System.out.println("minimum element is "+min);
    }
}
