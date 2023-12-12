import java.util.Calendar;

public class calendar {
    public static void main(String[] args) {
        
        int day,month,year;
        Calendar dmy = Calendar.getInstance();

        day=dmy.get(Calendar.YEAR);
        month=dmy.get(Calendar.MONTH);
        year=dmy.get(Calendar.DAY_OF_MONTH);

        int date=dmy.get(Calendar.DATE);


        System.out.println(day+" "+month+" "+year);

        System.out.println(date);

    }
}
