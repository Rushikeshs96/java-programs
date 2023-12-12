import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int[] arr = {5, 8, 6, 13, 3, -1};

        int n=arr.length;
        int k=2;  //position to rotate

        for(int i=0;i<k;i++)
        {
            int temp=arr[n-1];

            for(int j=n-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }

        //for rotating to left
        // for (int i = 0; i < k; i++) {
		// 	int temp = arr[0];
		// 	for (int j = 0; j < n - 1; j++) {
		// 		arr[j] = arr[j + 1];
		// 	}
		// 	arr[n - 1] = temp;
		// }

        System.out.println(Arrays.toString(arr));
    }   
}
