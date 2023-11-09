//Write a JAVA program to find those numbers which are divisible
//by 8 and multiple of 5, between 1000 and 2000 (both included)
public class prgm1 {
    public static void main(String args[]) {
        System.out.println("\n\nDivided by 8 & multiple of 5: ");
        for (int i_054=1000; i_054<2000; i_054++) {
            if (i_054%8==0 && i_054%5==0) System.out.print(i_054 +", ");
        }
        System.out.println("\n");
    }
}
