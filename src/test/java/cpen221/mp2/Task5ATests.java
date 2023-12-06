package cpen221.mp2;

import cpen221.mp2.boggle.BoggleBoard;
import cpen221.mp2.boggle.BogglePlayer;
import cpen221.mp2.utils.In;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5ATests {
    static String[] miniDict1 = {"A", "AT", "CAT", "RANT", "MANIC", "MANTIS", "METTLES", "MEMORIES", "MNEMOSYNE", "ANTICONSTITUTIONNELEMMENT", "Q", "QUEUE"};
    static String[] miniDict2 = {"HELL", "QUEUE", "YAK", "FISH", "MESS", "HATE", "ZILCH", "CHAI", "KAYAK", "QUERY", "CAT", "MET"};

    static BogglePlayer player1, player2, player3, player4;
    static BoggleBoard board2, board3, board4;
    static BoggleBoard board_1, board_2, board_3, board_4, board_5, board_6, board_7;

    @BeforeAll
    public static void init() {
        player1 = new BogglePlayer(miniDict1);
        player4 = new BogglePlayer(miniDict2);
        board2 = new BoggleBoard("data/boggle/board2x2.txt");
        board3 = new BoggleBoard("data/boggle/board3x3.txt");
        board4 = new BoggleBoard("data/boggle/board4x4.txt");
        player2 = new BogglePlayer(new In("data/boggle/dictionary-common.txt").readAllStrings());
        player3 = new BogglePlayer(new In("data/boggle/dictionary-shakespeare.txt").readAllStrings());
    }

    private static Set<String> getTextFrom(String address) {
        Set<String> allWords = new HashSet<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(address));
            String word;
            while ((word = reader.readLine()) != null) {
                allWords.add(word);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // String[] allWordsAsArray = new String[allWords.size()];
        // allWords.toArray(allWordsAsArray);
        // return allWordsAsArray;
        return allWords;
    }

//    @Test
//    public void scoreOf() {
//        assertEquals(0, player1.scoreOf("EPITOME"));
//        assertEquals(0, player1.scoreOf("A"));
//        assertEquals(0, player1.scoreOf("A"));
//        assertEquals(0, player1.scoreOf("AT"));
//        assertEquals(1, player1.scoreOf("CAT"));
//        assertEquals(1, player1.scoreOf("RANT"));
//        assertEquals(2, player1.scoreOf("MANIC"));
//        assertEquals(3, player1.scoreOf("MANTIS"));
//        assertEquals(5, player1.scoreOf("METTLES"));
//        assertEquals(11, player1.scoreOf("MEMORIES"));
//        assertEquals(11, player1.scoreOf("MNEMOSYNE"));
//        assertEquals(11, player1.scoreOf("ANTICONSTITUTIONNELEMMENT"));
//        assertEquals(0, player1.scoreOf("Q"));
//        assertEquals(2, player1.scoreOf("QEUE"));
//    }

    @Test
    public void getAllValidWords() {
        Set<String> allWords = new HashSet<>();
        allWords.add("CAT");
        allWords.add("ATE");
        allWords.add("EAT");
        allWords.add("TEA");
        allWords.add("ACT");
        allWords.add("ETC");
        allWords.add("ETA");
        allWords.add("ACE");

        assertEquals(allWords, player2.getAllValidWords(board2));

        assertEquals(true, player2.getAllValidWords(board4) != null);
    }

    @Test
    public void test1() {
        // normal word, down the middle
        BoggleBoard b = new BoggleBoard("data/boggle/board1.txt");
        Set<String> words = new HashSet<>();
        words.add("HELL");
        assertEquals(words, player4.getAllValidWords(b));
//        assertEquals(1, player4.getMaximumScore(b));
    }

    @Test
    public void test2() {
        // word that overlaps corners
        BoggleBoard b = new BoggleBoard("data/boggle/board2.txt");
        Set<String> words = new HashSet<>();
        words.add("QUEUE");
        assertEquals(words, player4.getAllValidWords(b));
//        assertEquals(2, player4.getMaximumScore(b));
    }

    @Test
    public void test3() {
        // only a word if you reuse the same letter
        BoggleBoard b = new BoggleBoard("data/boggle/board3.txt");
        Set<String> words = new HashSet<>();
        words.add("YAK");
        assertEquals(words, player4.getAllValidWords(b));
//        assertEquals(1, player4.getMaximumScore(b));
    }

    @Test
    public void test4() {
        // no words
        BoggleBoard b = new BoggleBoard("data/boggle/board4.txt");
        Set<String> words = new HashSet<>();
        assertEquals(words, player4.getAllValidWords(b));
//        assertEquals(0, player4.getMaximumScore(b));
    }

    @Test
    public void test5() {
        // TESTING Q
        BoggleBoard b = new BoggleBoard("data/boggle/board5.txt");
        Set<String> words = new HashSet<>();
        assertEquals(words, player4.getAllValidWords(b));
//        assertEquals(0, player4.getMaximumScore(b));
    }

    @Test
    public void test6() {
        // two non overlapping words
        BoggleBoard b = new BoggleBoard("data/boggle/board6.txt");
        Set<String> words = new HashSet<>();
        words.add("CAT");
        words.add("MET");
        words.add("HATE");
        assertEquals(words, player4.getAllValidWords(b));
//        assertEquals(3, player4.getMaximumScore(b));
    }

    @Test
    public void test7() {
        // two overlapping words
        BoggleBoard b = new BoggleBoard("data/boggle/board7.txt");
        Set<String> words = new HashSet<>();
        words.add("FISH");
        words.add("HATE");
        assertEquals(words, player4.getAllValidWords(b));
//        assertEquals(2, player4.getMaximumScore(b));
    }

    @Test
    public void test8() {
        // single row
        BoggleBoard b = new BoggleBoard("data/boggle/board8.txt");
        Set<String> words = new HashSet<>();
        words.add("ZILCH");
        words.add("CHAI");
        assertEquals(words, player4.getAllValidWords(b));
//        assertEquals(3, player4.getMaximumScore(b));
    }

}
