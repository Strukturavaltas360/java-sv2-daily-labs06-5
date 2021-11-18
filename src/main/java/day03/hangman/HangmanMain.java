package day03.hangman;

import java.util.Scanner;

    public class HangmanMain {

        public static void main(String[] args) {
            new day03.hangman.HangmanMain().run();
        }

        private void run() {
            String wordToFind = "alma";
            String wordFound = "____";
            int chances = 8;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Itt tartasz: " + wordFound);
                System.out.println("Ennyi tipped van: " + chances);
                System.out.print("Mi a következő tipp? ");
                String guess = scanner.nextLine();
                if (wordToFind.contains(guess)) {
                    System.out.println("jó betű");
                    wordFound = updateWordFound(wordToFind, wordFound, guess);
                }  else {
                    chances --;
                }
            } while (chances>0 && !wordToFind.equals(wordFound));

            if (wordToFind.equals(wordFound)) {
                System.out.println("Ügyes vagy!");
            } else {
                System.out.println("Sajnos vesztettél :(");
            }
        }

        private String updateWordFound(String wordToFind, String status, String guess) {
            char[] chars = status.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (wordToFind.charAt(i) == guess.charAt(0)) {
                    chars[i] = guess.charAt(0);
                }
            }
            return new String(chars);
        }
}
