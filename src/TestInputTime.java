import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TestInputTime {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        System.out.println("Nhập ngày tháng năm theo dịnh dạng dd/MM/yyyy");
        String inputTime = new Scanner(System.in).nextLine();

        SimpleDateFormat sDF = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date birthDay = sDF.parse(inputTime);
            cal1.setTime(birthDay);// tạo một time mới cho Calendar( tổng hợp tất cả)


            // Hiện tại có thể lấy đc các thành phần trong cal1.
            cal1.get(Calendar.YEAR);
            cal1.set(Calendar.DAY_OF_MONTH, 1);
            Date newTime = cal1.getTime();// lấy giá trị toàn bộ của Calendar
            //in ra giá trị mới, theo định dạng nào đó;
            String value = sDF.format(newTime);
            System.out.println(value);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
//Đúc kết
// Calendar là một lớp static , để lưu trữ thông tin ngày tháng năm , giờ của dữ liệu:
// Phương thức getTime(), trả về một object thuộc kiểu Date;
// Các phương thức khác như .get(Calendar.YEAR trả về dữ liệu kiểu số nguyên

//Phương thức setTime(Date data), dùng để truyền một dữ liệu kiểu Date vào Calendar;

//Lớp SimpleDateFormat là lớp quản lý cách thể hiện dữ liệu.
//Khởi tạo đối tượng từ SimpleDateFormat có phương thức , ví dụ dd/MM/yyyy;
//Dữ liệu String nhập vào cần đươc chuyển sang dạng Date
//Qua trình chuyển dữ liệu theo đối tượng thuộc lớp SimpleDateFomat.parse(String input);
// Phương thức .parse sẽ bị bắt lỗi khi người dùng nhập sai định dạng, vì thế cần đặt try/catch
