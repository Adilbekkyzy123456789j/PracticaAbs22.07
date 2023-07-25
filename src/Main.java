public class Main {
    public static void main(String[] args){

        Circle circle =  new Circle(3,3,3);
        circle.calculateArea();
        circle.calculatePerimeter();

        Triangle triangle = new Triangle(8,8,8);
        triangle.calculateArea();
        triangle.calculatePerimeter();

    }
}