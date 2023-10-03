class ReverseString{
    public static void main(String args[]){
        String str = "live";
        java.lang.StringBuffer input = new java.lang.StringBuffer();
        input.append(str);
        System.out.println("Original Word: "+str);
        System.out.println("Reversed word: "+input.reverse());
    }
}