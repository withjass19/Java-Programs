class SortingAlphabeticalOder{
    public static void main(String args[]){
        String names[] = {"Sourabh", "Anoop", "Harsh", "Alok", "Tanuj"};
        java.util.Arrays.sort(names); //sorting in ascending order by default
        System.out.println("The names in alphabetical order are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);            
        }
    }
}