class AreaOfCuboid{
    double area(double l, double h, double b){
        double a = 2*(l*b+b*h+h*l);
        return a;
    }
}
class Cuboid{
    public static void main(String a[]){
        double l = 12;
        double b = 7;
        double h = 5;
        System.out.println("Length of Cuboid: "+l);
        System.out.println("Width of Cuboid: "+b);
        System.out.println("Height of Cuboid: "+h);
        AreaOfCuboid obj = new AreaOfCuboid();
        double ans = obj.area(l,b,h);
        System.out.println("Area of Cylinder is "+ ans);
    }
}