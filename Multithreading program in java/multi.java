public class multi extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try 
            {
                Thread.sleep(500);
            } 
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        multi m = new multi();
        multi n = new multi();
        multi o = new multi();

        m.start();

        try{
            m.join();
        }
        catch(Exception e)
        {
            e.getMessage();
        }

        n.start();
        o.start();

    }
}
