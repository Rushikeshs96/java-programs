import java.util.Calendar;

interface info{
    public static final int value=5;

    public abstract void display();

}

public class interf implements info{

    public static void main(String[] args) {
        interf i=new interf();
        i.display();

       

    }
    
    public void display()
    {
        System.out.println("in display method");
    }
}
