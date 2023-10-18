class WordCount {
    public static void main(String[] args) {
        String inputString = "This is a sample string with multiple words.";
        int wordCount = countWords(inputString);
        System.out.println("Word count: " + wordCount);
    }
    public static int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }
}
