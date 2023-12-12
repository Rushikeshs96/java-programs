import java.util.Arrays;
import java.util.PriorityQueue;

public class sort {
    public static void main(String[] args) {

        int arr[] = { 2, 1, 22, 1, 0, 1, 0 };
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int a : arr) {
            pq.add(a);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = pq.poll();
        }

        System.out.println(Arrays.toString(arr));
    }
}
