class AreaOfEquilateralTriangle{
    double area(double side){
        double a = (Math.sqrt(3)/4*(side*side));
        return a;
    }
}
class EquilateralTriangle{
    public static void main(String a[]){
        double side = 7;
        System.out.println("Side of triangle: "+side);
        AreaOfEquilateralTriangle obj = new AreaOfEquilateralTriangle();
        double ans = obj.area(side);
        System.out.println("Area of triangle is "+ ans);
    }
}