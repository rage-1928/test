public class OOPSBanner {
    public static String[] getOPattern() {
        return new String[] {
            String.join("", " ***** "),
            String.join("", "*     *"),
            String.join("", "*     *"),
            String.join("", "*     *"),
            String.join("", "*     *"),
            String.join("", "*     *"),
            String.join("", " ***** ")
        };
    }
    public static String[] getPPattern() {
        return new String[] {
            String.join("", "****** "),
            String.join("", "*     *"),
            String.join("", "*     *"),
            String.join("", "****** "),
            String.join("", "*      "),
            String.join("", "*      "),
            String.join("", "*      ")
        };
    }
    public static String[] getSPattern() {
        return new String[] {
            String.join("", " ***** "),
            String.join("", "*     *"),
            String.join("", "*      "),
            String.join("", " ***** "),
            String.join("", "      *"),
            String.join("", "*     *"),
            String.join("", " ***** ")
        };
    }
    public static void main(String[] args) {
        String[] O1 = getOPattern();
        String[] O2 = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();
        for (int i = 0; i < 7; i++) {
            String bannerLine = String.join("   ",
                    O1[i],
                    O2[i],
                    P[i],
                    S[i]
            );
            System.out.println(bannerLine);
        }
    }
}