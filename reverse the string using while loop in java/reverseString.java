public class reverseString {
    public static void main(String[] args) {
        String a = "abcd";
        System.out.println("before reversing string: " + a);
        int start = 0;
        int end = a.length() - 1;

        char[] arr = a.toCharArray();
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        String reversedString = new String(arr);
        System.out.println("after reversing string: " + reversedString);
    }
}
