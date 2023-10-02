class ValumeOfCone{
    double area(double radius, double height){
        return (1/3 * Math.PI * radius * radius * height);
    }
}
class Cone{
    public static void main(String a[]){
        double r = 2;
        double h = 5;
        System.out.println("Radius of Cone: "+r);
        System.out.println("Height of Cone: "+h);
        ValumeOfCone obj = new ValumeOfCone();
        double ans = obj.area(r,h);
        System.out.println("Valume of cone is "+ ans);
    }
}