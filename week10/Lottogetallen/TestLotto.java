package week10.Lottogetallen;

public class TestLotto {
    static void main() {
        LottoNumbers lottoNumbers = new LottoNumbers();
        for (int i = 0; i < 10; i++) {
            lottoNumbers.generateLottoNumbers();
            System.out.println(lottoNumbers.showLottoNumbers());
        }
    }
}
