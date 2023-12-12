import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println("enter a number upto print prime numbers ");

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean b=true;

        if(num<=1)
        {
            System.out.println("first "+num+" prime numbers are :");
            System.out.println(2);
        }

        for (int i = 2; i <= num; i++) {
            b = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.print(i + " ");
            }
        }


    }
}
