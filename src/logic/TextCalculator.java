package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class TextCalculator {

    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(sentence);
        return tokens.countTokens();
    }

    public static long countCharactersWithSpaces(String text) {
        return text.chars()
                .count();
    }

    public static long countCharactersWithoutSpaces(String text) {
        char blank = ' ';
        return text.chars()
                .filter(t -> t != blank)
                .count();
    }

    public static boolean checkIfIsAPalindrome(String text) {
        boolean isAPalindrome = false;
        char blank = ' ';
        List<Character> characterList = text.chars()
                .mapToObj(textChar -> (char) textChar)
                .filter(textChar -> textChar != blank)
                .collect(Collectors.toList());
        List<Character> reversedCharacterList = new ArrayList<>(characterList);
        Collections.reverse(reversedCharacterList);

        for (int i = 0; i < characterList.size(); i++) {
            if (characterList.get(i).equals(reversedCharacterList.get(i))) {
                isAPalindrome = true;
            } else {
                isAPalindrome = false;
                break;
            }
        }
        return isAPalindrome;
    }
}