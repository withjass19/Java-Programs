class Squre_Prism{
    public static double Prism_Area(int side, int height){
        double SA = 2*side*side + 4*side*height;
        return SA;
    }

    public static void main(String args[]){
        int s = 7,
        h = 11;
        System.out.println("The area of the squre prism is: " + Prism_Area(s,h));
    }
}