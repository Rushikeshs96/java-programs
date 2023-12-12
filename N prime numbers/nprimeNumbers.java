import java.util.Scanner;

public class nprimeNumbers {
    public static void main(String[] args) {
        
        System.out.println("enter number to print prime numbers");
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        int count=0;
        int num=2;

        while(count<n)
        {
            if(isPrime(num))
            {
                System.out.println(" "+num);
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
