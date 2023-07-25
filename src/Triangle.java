public class Triangle extends Shape{


    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    void calculateArea() {
        double radius=0;
        System.out.println(Math.PI*radius*radius);
    }



    @Override
    void calculatePerimeter() {
        double a=0;
        double b=0;
        double c = 0;
        double s=(a+b+c)/2;
        System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));

    }
}
