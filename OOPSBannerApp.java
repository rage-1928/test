import java.util.*;
public class OOPSBannerApp {
    public static Map<Character, String[]> buildCharacterPatternMap() {
        Map<Character, String[]> patternMap = new HashMap<>();
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });
        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });
        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
        return patternMap;
    }
    public static void displayBanner(String message, Map<Character, String[]> patternMap) {
        int rows = patternMap.get(message.charAt(0)).length;
        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < message.length(); j++) {
                char ch = message.charAt(j);
                String[] pattern = patternMap.get(ch);
                line.append(pattern[i]).append("  ");
            }
            System.out.println(line.toString());
        }
    }
    public static void main(String[] args) {
        Map<Character, String[]> characterPatternMap = buildCharacterPatternMap();
        String word = "OOPS";
        displayBanner(word, characterPatternMap);
    }
}