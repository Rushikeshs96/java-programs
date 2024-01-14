package r;

public class reverse {
    public static void main(String[] args) {
        String str="welcomejava";

    char []arr=str.toCharArray();

    int left=0;
    int rigth=arr.length-1;

    while(left<rigth){
        
        char temp=arr[rigth];
        arr[rigth]=arr[left];
        arr[left]=temp;

        left++;
        rigth--;
    }

    String b=arr.toString();

    System.out.println(b);
    }
}
