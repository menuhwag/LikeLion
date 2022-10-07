package practice.java_221007.solo_369_game;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public void speakOrClap(int number) {

        List<Integer> parseNumbers = parse(number);

        int clapCount = countClap(parseNumbers);

        if (clapCount == 0) {
            System.out.println(number);
            return;
        }
        clap(clapCount);
    }

    private List<Integer> parse(int number) {
        List<Integer> result = new ArrayList<>();
        String str = String.valueOf(number);
        for (int i = 0; i < str.length(); i++) {
            int parseNumber = Integer.parseInt(String.valueOf(str.charAt(i)));
            result.add(parseNumber);
        }
        return result;
    }

    private int countClap(List<Integer> parseNumbers) {
        int clapCount = 0;
        for (int parseNumber : parseNumbers) {
            if (parseNumber == 0) continue;
            if (parseNumber % 3 == 0) clapCount++;
        }
        return clapCount;
    }

    private void clap(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("Clap ");
        }
        System.out.println();
    }
}
