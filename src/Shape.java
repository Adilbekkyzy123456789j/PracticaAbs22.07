public  abstract class Shape {

   private int a;
   private int c;
   private int b;
    public Shape() {
    }

    public Shape(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    abstract void calculateArea();
    abstract void calculatePerimeter();
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}




