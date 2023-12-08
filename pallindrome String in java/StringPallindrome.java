public class StringPallindrome {
    public static void main(String[] args) {
        String a="abcdcba";

        int start=0;
        int end=a.length()-1;
        boolean b=true;
        while(start<end)
        {
            if(a.charAt(start)!=a.charAt(end))
            {
              b=false;
            }

            start++;
            end--;
        }
       if(b)
       {
        System.out.println("string is pallindrome");
       }
       else{
        System.out.println("string is not pallindrome");
       }
    }
}
