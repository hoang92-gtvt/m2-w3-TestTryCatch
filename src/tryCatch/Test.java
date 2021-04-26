package tryCatch;

public class Test {
    public static void main(String[] args) {
        try {
            Triangle tamgiac1= new Triangle(2,3,4);
        } catch (IlegalTriangleEx e) {
            System.out.println(e.getMessage());
        }


    }
}
