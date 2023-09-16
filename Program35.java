class ValumeOfCylinder{
    double area(double radius, double height){
        return (Math.PI * radius * radius * height);
    }
}
class Cylinder{
    public static void main(String a[]){
        double r = 14;
        double h=20 ;
        System.out.println("Radius of Cylinder: "+r);
        System.out.println("Height of Cylinder: "+h);
        ValumeOfCylinder obj = new ValumeOfCylinder();
        double ans = obj.area(r,h);
        System.out.println("Valume of Cylinder is "+ ans);
    }
}