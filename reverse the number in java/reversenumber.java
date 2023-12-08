import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println("number before reverse is : "+num);
        int reminder,sum=0;

        while(num!=0)
        {
            reminder=num%10;
            sum=sum*10+reminder;
            num=num/10;
        }

        System.out.println("number after reverse is : "+sum);
    }
}
