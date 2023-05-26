import java.util.*;

public class Panagram {
    static String[] values = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    static Set<String> character = new HashSet<>();

    public static void main(String[] args) {

        System.out.println(checkPanagram("- The five boxing wizards jump quickly."));
    }

    public static String checkPanagram(String s) {
        var result = s.split("");
        for (var i : result) {

            if (Character.isLetter(i.charAt(0))) {
                character.add(i.toLowerCase());
            }
        }
        for (var j : values) {
            if (character.add(j)) {
                return "It is not a panagram";
            }

        }
        return "It is a panagram";
    }
}