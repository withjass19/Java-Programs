class AreaOfCylinder{
    double area(double r, double h){
        double a = 2*Math.PI*r*h;
        double b = 2*Math.PI*r*r;
        return a+b;
    }
}
class Cylinder{
    public static void main(String a[]){
        double r = 5;
        double h = 10;
        System.out.println("Radius of Cylinder: "+r);
        System.out.println("Height of Cylinder: "+h);
        AreaOfCylinder obj = new AreaOfCylinder();
        double ans = obj.area(r,h);
        System.out.println("Area of Cylinder is "+ ans);
    }
}