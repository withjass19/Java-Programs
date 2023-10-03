class IndexOfArray{
    public static void main(String[] args){
        int[] arr = {2,0,1,23,-1};
        int num = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("index of "+num+" is: " + (i+1));
                break;
            }
        }
    }
}