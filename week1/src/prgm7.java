public class prgm7 {
    public static void main(String[] args) {
        System.out.println("Numbers between 100 and 400 where each digit is even:");
        findEvenDigitNumbers_054(100, 400);
    }
    public static void findEvenDigitNumbers_054(int start, int end) {
        StringBuilder result_054 = new StringBuilder();

        for (int i_054 = start; i_054 <= end; i_054++) {
            if (hasEvenDigits(i_054)) {
                result_054.append(i_054).append(", ");
            }
        }
        if (result_054.length() > 0) {
            result_054.setLength(result_054.length() - 2);
        }

        System.out.println(result_054);
    }
    public static boolean hasEvenDigits(int number_054) {
        while (number_054 > 0) {
            int digit_054 = number_054 % 10;
            if (digit_054 % 2 != 0) {
                return false;
            }
            number_054 /= 10;
        }
        return true;
    }
}

