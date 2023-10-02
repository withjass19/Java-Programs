class ValumeOfSphere{
    double area(double radius){
        return (4/3 * Math.PI * radius * radius * radius);
    }
}
class Sphere{
    public static void main(String a[]){
        double r = 3;
        System.out.println("Radius of Sphere: "+r);
        ValumeOfSphere obj = new ValumeOfSphere();
        double ans = obj.area(r);
        System.out.println("Valume of Sphere is "+ ans);
    }
}