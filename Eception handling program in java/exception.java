import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number 1");
        int a=sc.nextInt();

        System.out.println("enter a number 1");
        int b=sc.nextInt();
        int c;
        try{
            c=a/b;
            System.out.println("division is "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.print(e.getMessage());
            e.printStackTrace();
        }
        finally{
            sc.close();
        }
    }
}
