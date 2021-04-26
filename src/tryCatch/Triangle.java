package tryCatch;

public class Triangle {
    int a;
    int b;
    int c;

//    public Triangle(int a, int b, int c) throws IlegalTriangleEx,
    public Triangle(int a, int b, int c) throws IlegalTriangleEx {
        if(a<=0||b<=0||c<=0){
            throw new IlegalTriangleEx("Cạnh tam giác phải lớn hơn 0");
        }
        if(a+b<=c||a+c<=b||b+c<=a){
            throw new IlegalTriangleEx("Tổng hai cạnh bất kỳ phải lớn hơn cạnh còn lại");
        }


        this.a = a;
        this.b = b;
        this.c = c;
    }
}
