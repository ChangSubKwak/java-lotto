package lotto.utils;

import lotto.domain.LottoNumber;
import lotto.domain.LottoTicket;

import java.util.HashSet;
import java.util.List;

public class Validator {
    private Validator() {}

    public static void checkCountOfLottoBuy(int number) {
        if(number < 0){
            throw new IllegalArgumentException("구매할 로또의 개수가 맞지 않습니다.");
        }
    }

    public static void checkNumberValidation(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닌 데이터입니다.");
        }
    }

    public static void checkBuyPriceValidation(int price) {
        if (price < LottoTicket.PRICE) {
            throw new IllegalArgumentException("로또를 구매할 수 없는 가격입니다.");
        }
    }

    public static void checkLottoNumberValidation(int number) {
        if (number < LottoNumber.MIN_LOTTO_NUMBER || number > LottoNumber.MAX_LOTTO_NUMBER) {
            throw new IllegalArgumentException("잘못된 로또 번호 입니다.");
        }
    }

    public static void checkLengthLottoNumberSize(int length) {
        if (length != LottoTicket.PICKED_NUMBERS_SIZE) {
            throw new IllegalArgumentException("당첨 로또 번호의 개수가 옳지 않습니다.");
        }
    }

    public static void checkDuplicatedLottoNumbers(List<LottoNumber> lottoNumbers) {
        if (new HashSet<>(lottoNumbers).size() != lottoNumbers.size()) {
            throw new IllegalArgumentException("로또번호 중에 중복된 수가 있습니다.");
        }
    }

    public static void checkWinningNumbersInBonusNumber(List<LottoNumber> winningNumbers, LottoNumber bounsNumber) {
        if (winningNumbers.contains(bounsNumber)) {
            throw new IllegalArgumentException("당첨번호 중에 보너스 볼과 겹치는 수가 있습니다.");
        }
    }
}