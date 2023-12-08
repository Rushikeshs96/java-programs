import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number");
        int num=sc.nextInt();

        sc.nextLine();
        System.out.println("enter a String");
        String str=sc.nextLine();

        System.out.println("enter a float");
        float f=sc.nextFloat();

        System.out.println("number is :"+num+" "+"string = "+str+"float is="+f);
    }
}
