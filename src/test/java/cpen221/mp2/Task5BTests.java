package cpen221.mp2;

import cpen221.mp2.boggle.BoggleBoard;
import cpen221.mp2.boggle.BogglePlayer;
import cpen221.mp2.utils.In;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5BTests {

    private static final Map<Integer, Integer> POINTS_TABLE;
    private static final int LONGEST_NEEDED = 8;
    private static final int TOO_SHORT = 2;
    private static final Integer[][] POINT_ASSOCIATION = {{TOO_SHORT, 3, 4, 5, 6, 7, LONGEST_NEEDED},
            {0, 1, 1, 2, 3, 5, 11}};

    /* Initialises the map of length of word to number of points. */
    static {
        POINTS_TABLE = new HashMap<>();
        for (int i = 0; i < POINT_ASSOCIATION[0].length; i++) {
            POINTS_TABLE.put(POINT_ASSOCIATION[0][i], POINT_ASSOCIATION[1][i]);
        }
    }

    private static int getMaximumScore(Set<String> allWords) {
        int totalPoints = 0;

        for (String word : allWords) {
            totalPoints += scoreOf(word);
        }

        return totalPoints;
    }

    /**
     * Given a word, determines how many points the word would get according to boggle rules.
     *
     * @param word the word that's score will be computed. Must not be {@code null}.
     * @return the number of points that the word is worth.
     */
    private static int scoreOf(String word) {
        if (word.length() >= LONGEST_NEEDED) {
            return POINTS_TABLE.get(LONGEST_NEEDED);
        } else if (word.length() <= TOO_SHORT) {
            return POINTS_TABLE.get(TOO_SHORT);
        }

        return POINTS_TABLE.get(word.length());
    }

    @Test
    public void testBoggleShakespeare() {
        BoggleBoard board = new BoggleBoard(new char[][]{
                {'S', 'A', 'B', 'T'},
                {'R', 'E', 'I', 'A'},
                {'P', 'M', 'O', 'T'},
                {'P', 'W', 'O', 'P'}});
        In in = new In(new File("data/boggle/dictionary-shakespeare.txt"));

        String[] nurseryDictionary = in.readAllStrings();
        BogglePlayer player = new BogglePlayer(nurseryDictionary);

        Set<String> allWords = player.getAllValidWords(board);
        assertEquals(303, getMaximumScore(allWords));
    }

    @Test
    public void test6x6Board() {
        BoggleBoard board = new BoggleBoard(new char[][]{
                {'O', 'L', 'C', 'Y', 'N', 'S'},
                {'O', 'V', 'R', 'I', 'G', 'Q'},
                {'G', 'E', 'Y', 'T', 'W', 'I'},
                {'L', 'H', 'M', 'N', 'R', 'I'},
                {'N', 'B', 'A', 'D', 'R', 'O'},
                {'S', 'G', 'D', 'D', 'Z', 'Y'}

        });
        In in = new In(new File("data/boggle/dictionary-common.txt"));

        String[] commonDictionary = in.readAllStrings();
        BogglePlayer player = new BogglePlayer(commonDictionary);

        Set<String> allWords = player.getAllValidWords(board);
        assertEquals(269, getMaximumScore(allWords));
    }
}
