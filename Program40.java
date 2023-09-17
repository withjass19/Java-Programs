class AreaOfCube{
    double area(double s){
        double a = 6*Math.pow(s,2);
        return a;
    }
}
class Cube{
    public static void main(String a[]){
        double s = 10;
        // System.out.println("length = width = height");
        System.out.println("side of CUbe: "+s);
        AreaOfCube obj = new AreaOfCube();
        double ans = obj.area(s);
        System.out.println("Area of CUbe is "+ ans);
    }
}