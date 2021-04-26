package tryCatch;

public class IlegalTriangleEx extends Exception{
    String message ;

    public IlegalTriangleEx(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
