public class reverseString {
  public static void main(String[] args) {
    String str="abcd";
    System.out.println(str);
    char[]arr=str.toCharArray();

    for(int i=0;i<arr.length/2;i++)
    {
        char a=arr[i];
        arr[i]=arr[arr.length-1-i];
        arr[arr.length-1-i]=a;
    }

    String reverse=new String(arr);

    System.out.println("reversed String : "+reverse);
  }   
}
