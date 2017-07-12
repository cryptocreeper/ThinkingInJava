package chapter13_strings.task07;

public class Main {
    private static boolean checkSentence(String sentence) {
        return sentence.matches("[[А-Я][A-Z]].+\\.");
    }

    public static void main(String[] args) {
        System.out.println(checkSentence("This is a normal sentence."));
        System.out.println(checkSentence("Check it"));
        System.out.println(checkSentence("begins with a small letter."));
        System.out.println(checkSentence("Предложение на русском."));
    }
}
