public class OOPSBannerU {
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public char getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static String[] createOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }
    public static String[] createPPattern() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }
    public static String[] createSPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', createOPattern()),
                new CharacterPatternMap('O', createOPattern()),
                new CharacterPatternMap('P', createPPattern()),
                new CharacterPatternMap('S', createSPattern())
        };
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPatternMap pattern : patterns) {

                line.append(pattern.getPattern()[i]).append("   ");

            }
            System.out.println(line);
        }
    }
}