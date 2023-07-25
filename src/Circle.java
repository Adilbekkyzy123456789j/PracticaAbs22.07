import static java.lang.Math.PI;

public class Circle extends Shape{


    public Circle() {
    }

    public Circle(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    void  calculateArea() {

        double radius = 0;

        System.out.println(PI*radius*radius);
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
