public class pallindromebumber {
    public static void main(String[] args) {
        int num = 5115;
        int s = num;

        int reminder, sum = 0;

        while (num != 0) {
            reminder = num % 10;
            sum = sum * 10 + reminder;
            num = num / 10;
        }

        System.out.println("number after reverse is : " + sum);

        if (s == sum) {
            System.out.println("pallindrome number");
        } else {
            System.out.println("not a pallindrome number");
        }
    }
}
