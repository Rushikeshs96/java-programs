import java.util.Scanner;

public class toCelcius {
    public static void main(String[] args) {
        float temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the temperature in farenheight");
        temp=sc.nextInt();

       float celcius =((temp-32)*5)/9;

       System.out.println("the temperature in celcius is :"+celcius);
    }
}
