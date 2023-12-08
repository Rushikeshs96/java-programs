public class compareStrings {
    public static void main(String[] args) {
        String a="helloo";
        String b="hello";

        if(a.compareTo(b)>0)
        {
            System.out.println("a is greater than b");
        }
        else if(a.compareTo(b)<0)
        {
            System.out.println("b is greater than a");
        }
        else{
            System.out.println("both are equals");
        }
    }
}
