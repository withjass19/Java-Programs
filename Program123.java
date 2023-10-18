class VowelCount {
    public static void main(String[] args) {
        String inputString = "This is a sample string with vowels.";
        int vowelCount = countVowels(inputString);
        System.out.println("Vowel count: " + vowelCount);
    }

    public static int countVowels(String input) {
        input = input.toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
