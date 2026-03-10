import java.util.HashMap;

public class UseCase8 {

    // Method to create character patterns
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        charMap.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        charMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        return charMap;
    }

    // Method to display banner
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        message = message.toUpperCase();
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < message.length(); j++) {
                char ch = message.charAt(j);

                if (charMap.containsKey(ch)) {
                    System.out.print(charMap.get(ch)[i] + "  ");
                } else {
                    System.out.print("       ");
                }
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}