import java.util.HashMap;
class RomanToInteger {
    public static void main(String[] args) {
        String roman = "MCMXCIV";

        int result = romanToInteger(roman);

        System.out.println("Roman numeral: " + roman);
        System.out.println("Integer equivalent: " + result);
    }

    public static int romanToInteger(String s) {
        HashMap<Character, Integer> romanValues = new HashMap();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanValues.get(s.charAt(i));
            
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }
}
