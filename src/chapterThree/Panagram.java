package chapterThree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Panagram {
    static String[] alphabets={"a", "b", "c", "d", "e","f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p","q","r","s","t","u","v", "w","x","y","z"};
    static Set<String> characters = new HashSet<>();

   public static void main(String[] args){
       System.out.println(checkPanagram("- The five boxing wizards jump quickly."));
   }

    private static String checkPanagram(String s) {
       var result = s.split("");
        for (var i:result) {
            if(Character.isLetter(i.charAt(0))) {
                characters.add(i.toLowerCase());
            }
        } System.out.println(characters);
        for (var j:alphabets){
           if (characters.add(j)){
               return "It is not a panagram";
           }
        }
        return "It is a panagram";
    }
}
