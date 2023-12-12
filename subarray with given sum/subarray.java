public class subarray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 6, 13, 3, -1};
        int sum = 14;

        int start = 0;
        int currentSum = arr[0];

        for (int i = 1; i <= arr.length; i++) {
            while (currentSum > sum && start < i - 1) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == sum) {
                System.out.println("Subarray found from " + start + " to " + (i - 1));
                return;
            }

            if (i < arr.length) {
                currentSum += arr[i];
            }
        }

        System.out.println("Subarray not found.");
    }
}
