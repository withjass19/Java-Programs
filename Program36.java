class ValumeOfCuboid{
    double area(double l, double h, double b){
        return l*b*h;
    }
}
class V_Cuboid{
    public static void main(String a[]){
        double l = 12;
        double b = 7;
        double h = 5;
        System.out.println("Length of Cuboid: "+l);
        System.out.println("Width of Cuboid: "+b);
        System.out.println("Height of Cuboid: "+h);
        AreaOfCuboid obj = new AreaOfCuboid();
        double ans = obj.area(l,b,h);
        System.out.println("Valume of Cuboid is "+ ans);
    }
}