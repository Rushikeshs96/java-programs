public class staticblock {
    public static void main(String[] args) {
        System.out.println("main method");
        display();
    }

    static{
        System.out.println("static block executed");
    }

    public static void display()
    {
        System.out.println("in display method");
    }
}
