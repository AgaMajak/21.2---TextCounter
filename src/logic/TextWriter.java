package logic;

import java.io.PrintWriter;

public class TextWriter {

    public static void writeCalculatedTextToUser(String text, PrintWriter writer) {
        writer.println("<i>" + text + "</i>");
        writer.println("<h1>Ilość słów: " + TextCalculator.countWordsUsingStringTokenizer(text) + "</h1>");
        writer.println("<h1>Ilość wszystkich znaków: " + TextCalculator.countCharactersWithSpaces(text) + "</h1>");
        writer.println("<h1>Ilość znaków bez spacji: " + TextCalculator.countCharactersWithoutSpaces(text) + "</h1>");
        writer.println("<h1>Palindrom: " + TextCalculator.checkIfIsAPalindrome(text) + "</h1>");
    }
}