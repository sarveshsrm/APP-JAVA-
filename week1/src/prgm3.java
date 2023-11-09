public class prgm3 {
    public static void main(String[] args) {
        // left pasal triangle
        int size_054=5;

        for (int i_054 = 1; i_054 <= size_054; i_054++) {
            for (int j_054 = 0; j_054 < i_054; j_054++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i_054 = 1; i_054 <= size_054 - 1; i_054++) {
            for (int j_054 = 0; j_054 < size_054 - i_054; j_054++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

