class AreaOfTriangle{
    double area(double height, double base){
        return 0.5*height*base;
    }
}
class Triangle{
    public static void main(String a[]){
        double h = 3;
        double b = 7;
        System.out.println("Height of triangle: "+h);
        System.out.println("Base of triangle: "+b);
        AreaOfTriangle obj = new AreaOfTriangle();
        System.out.println("Area of triangle is "+obj.area(h,b));
    }
}