/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/9/15
 * Time: 5:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class WordDistance {
    public static void main(String[] args) {
        String[] words = {"the", "quick", "brown", "fox", "ran", "quick", "away"};
        String start = "away";
        String end = "quick";
        System.out.println("word distance: " + wordDistance(words, start, end));
    }

    private static int wordDistance(String[] words, String start, String end) {
        int word1Index = -1, word2Index = -1;
        int minDistance=Integer.MAX_VALUE;
        for (int i=0; i<words.length; i++) {
            String word = words[i];
            if (word.equalsIgnoreCase(start)) {
                word1Index = i;
            } else if (word.equalsIgnoreCase(end)) {
                word2Index = i;
            }
            if (word2Index != -1 && word2Index != -1) {
                minDistance = Math.min(minDistance, Math.abs(word1Index-word2Index));
            }

        }

        return minDistance;
    }
}
