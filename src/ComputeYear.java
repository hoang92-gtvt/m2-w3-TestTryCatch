import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ComputeYear {
    public static void main(String[] args) {
        Calendar cal=  Calendar.getInstance(); // 1 ham statis.

        System.out.println("Thời gian hiện tạim: " +cal.getTime());
        int yearNow = cal.get(Calendar.YEAR);
        System.out.println("Năm hiện tại là: "+ yearNow);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("Ngày thứ n trong tuần : "+ dayOfWeek);
        int dayOfWeekInMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println("Ngày thuộc  tuần thứ n trong tháng: "+ dayOfWeekInMonth);
//Thay đổi một trường trong đối tượng;
        cal.set(Calendar.DAY_OF_MONTH, 1);
        int dayOfWeekInMonth2 = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println("Ngày thuộc  tuần thứ n trong tháng: "+ dayOfWeekInMonth2);

//Kết hợp lớp Date và lớp SimpleDateFormat để hiện thị đinh dạng ngày tháng
        Date times = cal.getTime();
        System.out.println(times);
        SimpleDateFormat sDF1 = new SimpleDateFormat("dd/MM/yyyy");

        String abc = sDF1.format(times);
        System.out.println(abc);

        SimpleDateFormat sDF2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sDF2.format(times));

        SimpleDateFormat sDF3 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aaa");
        System.out.println(sDF3.format(times));


    }
}
