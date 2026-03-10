import java.util.HashMap;
import java.util.Map;

public class OopsBanner {

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> patterns) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            for (char c : word.toCharArray()) {

                String[] pattern = patterns.get(c);

                if (pattern != null) {
                    System.out.print(pattern[i] + "   ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patterns.put('P', new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        patterns.put('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " **** ",
                "     *",
                "     *",
                "***** "
        });

        renderBanner("OOPS", patterns);
    }
}