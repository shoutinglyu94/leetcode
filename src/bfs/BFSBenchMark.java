package bfs;

import java.util.Arrays;
import java.util.List;

public class BFSBenchMark {
    public static void main(String[] args) {
        String start = "hit";
        String end = "cog";
        String[] wordArray = new String[] {
                "hot","dot","dog","lot","log","cog"
        };
        List<String> wordDict = Arrays.asList(wordArray);
        WordLadder2 wordLadder2 = new WordLadder2();
        List<List<String>> res = wordLadder2.wordLadder2(start, end, wordDict);
        System.out.println(res);
    }


}