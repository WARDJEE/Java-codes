package week10.Lottogetallen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LottoNumbers {
    private List<Integer> numbers;
    private static int[] lottonumbers;
    private final int MAX_LENGTE = 6;

    public LottoNumbers() {
        this.numbers = new ArrayList<>();
        for (int i = 1; i < 45; i++) {
            this.numbers.add(i);
        }
        lottonumbers = new int[this.MAX_LENGTE];
    }

    public void generateLottoNumbers(){
        Collections.shuffle(this.numbers);
        for (int i = 0; i < this.MAX_LENGTE; i++) {
            lottonumbers[i] = this.numbers.get(i);
        }

        Arrays.sort(lottonumbers);
    }

    public String showLottoNumbers(){
        StringBuilder sb = new StringBuilder();
        for (int number : lottonumbers) {
            sb.append((number < 10) ? " " : "");
            sb.append(number).append(" ");
        }
        return sb.toString();
    }
}
