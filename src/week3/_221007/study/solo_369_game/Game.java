package week3._221007.study.solo_369_game;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public void speakOrClap(int number) {

        List<Integer> parseNumbers = parse(number); // 각 자릿수를 분리하여 List로 저장.

        int clapCount = countClap(parseNumbers); // Clap을 몇 번 쳐야하는 지 계산.

        if (clapCount == 0) {
            System.out.println(number); // 박수를 칠 필요없다면 입력받은 숫자를 그대로 출력.
            return;
        }
        clap(clapCount); // 박수를 쳐야한다면 박수칠 횟수만큼 Clap을 출력.
    }

    private List<Integer> parse(int number) { // 자릿수 구하기.
        List<Integer> result = new ArrayList<>();
        while (number > 0) {
            result.add(number % 10);
            number = number / 10;
        }
        return result;
    }

    private int countClap(List<Integer> parseNumbers) { // 박수 횟수 계산.
        int clapCount = 0;
        for (int parseNumber : parseNumbers) {
            if (parseNumber == 0) continue; // 0은 어떤 수로 나눠도 0이기때문에 3의 배수를 구하는 아래 로직에 문제가 생겨 먼저 처리해준다.
            if (parseNumber % 3 == 0) clapCount++; // 3의 배수 (3, 6, 9)가 들어오면 박수 횟수를 1 증가한다.
        }
        return clapCount;
    }

    private void clap(int count) { // Clap 출력.
        for (int i = 0; i < count; i++) {
            System.out.print("Clap ");
        }
        System.out.println();
    }
}
