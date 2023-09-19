class AreaOfRhombus{
    double area(double d1,double d2){
        return ((d1*d2)/2);
    }
}
class Rhombus{
    public static void main(String a[]){
        double d1 = 6;
        double d2 = 12;
        System.out.println("Side of triangle: "+d1);
        System.out.println("Side of triangle: "+d2);
        AreaOfRhombus obj = new AreaOfRhombus();
        double ans = obj.area(d1,d2);
        System.out.println("Area of Rhombus is "+ ans);
    }
}