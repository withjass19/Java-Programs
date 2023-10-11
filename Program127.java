class PentagonArea{
    public static void main(String[] args) {
        double sideLength = 7.0;
        double area = calculatePentagonArea(sideLength);
        System.out.println("Area of the pentagon: " + area);
    }
    public static double calculatePentagonArea(double sideLength) {
        double area = (5.0 / 4.0) * Math.pow(sideLength, 2) / Math.tan(Math.PI / 5);
        return area;
    }
}
